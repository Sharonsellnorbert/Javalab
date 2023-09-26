/*
 * File			:Sum.java
 * Description	:Finding Sum
 * Author		:Sharon Sell Norbert
 * Version 		:1.0
 * Date			:26-09-2023
 */
package Helloworld;
import java.util.Scanner;
public class Sum {
	public static void main(String[]args) {
		int Number1,Number2,Sum=0;
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter The first Number");
		 Number1=sc.nextInt();
		 System.out.println("Enter The Second Number");
		 Number2=sc.nextInt();
		 Sum=Number1+Number2;
		 System.out.println("The Sum is"+Sum);
		
	}

}
