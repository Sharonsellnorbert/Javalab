/*
 * File			:Frequency.java
 * Description	:Finding Frequency of a character in a string
 * Author		:Sharon Sell Norbert
 * Version 		:1.0
 * Date			:01-10-2023
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
		char character=sc.next().charAt(0);
		int Frequency=Freq(line,character);
		System.out.println("Frequency is "+Frequency);
		}
		static  int Freq(String line,char character) {
			char[] CharArray= line.toCharArray();
			int Strlength=line.length(),count=0;
		    for(int i=0;i<Strlength;i++){
		    	if(CharArray[i]==character)
		    	{
		    		count++;		    				
		    	}
		    }
		    return count;
		}
}

		    


