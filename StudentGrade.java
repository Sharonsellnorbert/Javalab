/*
 * File			:StudentGrade.java
 * Description	:Printing Grade of Student
 * Author		:Sharon Sell Norbert
 * Version 		:1.0
 * Date			:26-09-2023
 */package Helloworld;
import java.util.Scanner;
public class StudentGrade {
	public static void main(String[]args) {
		int Percentage;
		System.out.println("Enter the Mark out of 100");
		Scanner sc=new Scanner(System.in);
		Percentage=sc.nextInt();
		if(Percentage>=90) {
			System.out.println("S Grade is given");
		}
		else if(Percentage<90&&Percentage>=80) {
			System.out.println("A Grade is given");
		}
		else if(Percentage<80&&Percentage>=70) {
			System.out.println("B Grade is given");
		}
		else if(Percentage<70&&Percentage>=60) {
			System.out.println("C Grade is given");
		}
		else if(Percentage<60&&Percentage>=50) {
			System.out.println("P Grade is given");
		}
		else {
			System.out.println("FAILED");
		}
		
	}	
}
