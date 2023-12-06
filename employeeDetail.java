/*
 * File			:MethodOverload.java
 * Description	        :To use methodoverloading and print the details of officer and manager
 * Author		:Sharon Sell Norbert
 * Version 		:1.0
 * Date			:17-10-2023
 */
package Helloworld;
import java.util.Scanner;
public class employeeDetail {
	public static void main(String[]args) {
		Officer of=new Officer();
		Manager Ma=new Manager();
		System.out.println("Enter the Details of Officer");
		of.setDetails();
		of.setSalary();
		of.setSpecialization();
		of.getDetails();
		of.printSalary();
		of.getSpecialization();
		System.out.println("Enter THE Details Of Manager");
		Ma.setDetails();
		Ma.setSalary();
		Ma.setDepartment();
		Ma.getDetails();
		Ma.printSalary();
		Ma.getDepartment();	
	}

}
class Employee{
	String Name,Address;
	int Age,Salary;
	long phoneNo;
	void setDetails() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Name ");
		Name=sc.nextLine();
		System.out.println("Enter The Address");
		Address=sc.nextLine();
		System.out.println("Enter The Age");
		Age=sc.nextInt();
		System.out.println("Enter Phone Number");
		phoneNo=sc.nextLong();
	}
	void getDetails() {
		System.out.println("NAME : "+Name);
		System.out.println("AGE :"+Age);
		System.out.println("ADDRESS :"+Address);
		System.out.println("PHONE NUMBER :"+phoneNo);
	}
	void setSalary(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Salary");
		Salary=sc.nextInt();
	}	
	void printSalary(){
		System.out.println("SALARY :"+Salary);
	}
}
class Officer extends Employee{
	String Specialization; 
	void setSpecialization() {
	    Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Specialization");
	    Specialization=sc.nextLine();
	}
	 void getSpecialization() {
		 System.out.println("SPECIALIZATION : "+Specialization); 
	 }
}
class Manager extends Employee{
	String department;
	Scanner sc= new Scanner(System.in);
	void setDepartment() {
		System.out.println("Enter the Department of Manager");
		department=sc.nextLine();		
	}
	void getDepartment() {
		System.out.println("DEPARTMENT :"+department);
	}
}
