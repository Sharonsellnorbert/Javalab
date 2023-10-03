/*
 * File			:Palindrome.java
 * Description	:Checking Whether a string is palindrome or not
 * Author		:Sharon Sell Norbert
 * Version 		:1.0
 * Date			:01-10-2023
 */
package Helloworld;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[]args) {
		String Character;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		Character=sc.next();
		boolean isPalindrome=Check(Character);
		if(isPalindrome==false) {
		 System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
	}
		static  boolean Check(String Character) {
			char[] CharArray= Character.toCharArray();
			int Strlength=Character.length();
		    for(int i=0;i<Strlength/2;i++){
		    	if(CharArray[i]==CharArray[Strlength-i-1])
		    	{
		    		return false;
		    				
		    	}
		    return true;
		    	
		    }
		    return false;
		}
}
		    
		
			
	


