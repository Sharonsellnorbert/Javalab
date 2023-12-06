/*
 * File			:Frequency.java
 * Description	:Finding Frequency of a character in a string
 * Author		:Sharon Sell Norbert
 * Version 		:1.0
 * Date			:03-10-2023
 */
package Helloworld;

import java.util.Scanner;

public class Frequency {
	public static void main(String[]args) {
			String line;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the string");
			line=sc.nextLine();
			System.out.println("Enter the character to be Searched");
			char checkMe=sc.next().charAt(0);
			int Frequency=checkFreq(line,checkMe);
			if(Frequency==0){
				System.out.println("The Character is not present in the String");
			}
			else {
			System.out.println("Frequency is "+Frequency);
			}
		}
			static  int checkFreq(String line,char checkMe) {
				char[] CharArray= line.toCharArray();
				int charCount=line.length(),count=0;
			    for(int i=0;i<charCount;i++){
			    	if(CharArray[i]==checkMe)
			    	{
			    		count++;		    				
			    	}
			    }
			    return count;
			}
	}
