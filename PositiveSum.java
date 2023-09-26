/*
 * File			:StudentGrade.java
 * Description	:Printing Grade of Student
 * Author		:Sharon Sell Norbert
 * Version 		:1.0
 * Date			:26-09-2023
 */package Helloworld;
import java.util.Scanner;
public class PositiveSum {
	public static void main(String[]args) {
		int Number=0,Sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The First Number");
		Number=sc.nextInt();
		while(Number>0) {
			Sum=Sum+Number;
			System.out.println("Enter The Next Number");
			Number=sc.nextInt();
		}
		System.out.println("Sum is "+Sum);
	}

}
