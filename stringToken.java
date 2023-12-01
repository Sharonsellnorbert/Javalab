/*
 * File			:stringToken.java
 * Description	:To find sum of numbers from a string using String Tokenizer 
 * Author		:Sharon Sell Norbert
 * Version 		:1.0
 * Date			:28-11-2023
 */
package Helloworld;
import java.util.StringTokenizer;
import java.util.Scanner;
public class stringToken {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int num,sum=0;
		System.out.println("Enter the string");
		String data=sc.nextLine();
		StringTokenizer str = new StringTokenizer(data);
		while(str.hasMoreTokens()) {
			num=Integer.parseInt(str.nextToken());
			sum=sum+num;
		}
		System.out.println("Sum is "+sum);
	}
}