/*
 * File			:multiTableThread.java
 * Description	:Printing the  Matrix Multiplication Table using Threads
 * Author		:Sharon Sell Norbert
 * Version 		:1.0
 * Date			:2-12-2023
 */
package Helloworld;
import java. util.Scanner;
public class multiTableThread {
		public static void main(String[]args){
			multiTable tab=new multiTable();
			thread1 t1= new thread1(tab);
			thread2 t2= new thread2(tab);
			thread3 t3=new thread3(tab);
			t1.setPriority(7);
			t2.setPriority(6);
			t3.setPriority(5);
			t1.start();
			t2.start();
			t3.start();
		}
	}
	class multiTable{
		synchronized void printTable(int num) {              //synchronized used as a function
			/*synchronized (this) {*/	                     //synchronized is used as a block
			for(int i=1;i<=10;i++) {
					System.out.println(num+"*"+i+"="+num*i);
				}
		    /*}*/                                            //synchronized can be used in block as well as in function 
		}
	}
	class thread1 extends Thread{
		Scanner sc= new Scanner(System.in);
		int num;
		multiTable m; 
		thread1(multiTable in){
			this.m=in;
			System.out.println("Enter the Number");
			num=sc.nextInt();	
			}
		public void run() {
			m.printTable(num);
		}
	}
	class thread2 extends Thread{
		Scanner sc= new Scanner(System.in);
		int num;
		multiTable m; 
		thread2(multiTable in){
			this.m=in;
			System.out.println("Enter the Number");
			num=sc.nextInt();
		}
		public void run() {
			m.printTable(num);
		}
	}
	class thread3 extends Thread{
		Scanner sc= new Scanner(System.in);
		int num;
		multiTable m;
		thread3(multiTable in){
		this.m=in;
		System.out.println("Enter the Number");
		num=sc.nextInt();
		}
		public void run() {
			m.printTable(num);
		}
	}
