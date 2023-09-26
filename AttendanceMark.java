/*
 * File			:AttandanceMark.java
 * Description	:Finding Attendance Mark
 * Author		:Sharon Sell Norbert
 * Version 		:1.0
 * Date			:26-09-2023
 */
package Helloworld;
import java.util.Scanner;
public class AttendanceMark {
	public static void main(String[]args) {
		int Attendance;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Attendance Percentage");
		Attendance=sc.nextInt();
		if(Attendance>=90) {
			System.out.println("10 mark is Obtained");
		}
		else {
			System.out.println("Mark Obtained is "+Attendance/10);
		}
		
		
		}
	

}
