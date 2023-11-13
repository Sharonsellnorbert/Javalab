package LabInternal;
import java.util.Scanner;
public class Bankexception {
	public static void main(String[]args) {
		int Choice=0,size,Number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Customers");
		size=sc.nextInt();
		Customer []customer= new Customer[size];
		for(int i=0;i<size;i++) {
		    customer[i]=new Customer();
			customer[i].getCustomerDetails();
		}
		while(Choice!=5){
			System.out.println("1.Display all account details\n2.Search by account number\n3.Deposit the amount\n4.Withdraw the amount\n5.Exit\n");
			System.out.println("Enter the choice");
		    Choice=sc.nextInt();
			if(Choice==1) {
				 for(int i=0;i<size;i++) {
					 customer[i].showDetails();	
				 }
			 }
			 else if(Choice==2) {
			    System.out.println("Enter the Account Number  to be searched");
				Number=sc.nextInt();
				for(int i=0;i<size;i++) {
						if(customer[i].AccNo==Number) {
							customer[i].showDetails();	
						}
					}
			 }
	         else if(Choice==3) {
	           	    System.out.println("Enter the Account Number to Deposit Money");
					Number=sc.nextInt();
					try {
						int Deposit;
						System.out.println("Enter Amount to be Deposited");
						Deposit=sc.nextInt();
						if(Deposit<0) {
							throw  amountException;
						}
					    else {
						    for(int i=0;i<size;i++) {
							   if(customer[i].AccNo==Number) {
								   customer[i].Balance=customer[i].Balance+Deposit;
								   customer[i].showDetails();
							}
						}	
					}
					}
					catch(amountException e){
						System.out.println("Invalid amount");
					}
	         }
	         else if(Choice==4) {
	        	 System.out.println("Enter the Account Number to Withdraw Money");
	        	 Number=sc.nextInt();
	        	 try {
			     int Withdraw;
			     System.out.println("Enter Amount to be Withdrawed");
				 Withdraw=sc.nextInt();
				 if(Withdraw<0) {
					 throw FundsException;
				 }
				 else {
					for(int i=0;i<size;i++) {
							if(customer[i].AccNo==Number) {
								customer[i].Balance=customer[i].Balance+Withdraw;
								customer[i].showDetails();
							}
					}
				}
					
	         }
	       
		}
	}
}
}
	class Customer{
	    int AccNo,Balance;
	    String AccType,AccName;
	    Scanner sc=new Scanner(System.in);
		void getCustomerDetails() {
			System.out.println("Enter the Account Number");
		    AccNo=sc.nextInt();
		    System.out.println("Enter the Account Type");
		    AccType=sc.next();
		    System.out.println("Enter the Account Name");
		    AccName=sc.next();
		    System.out.println("Enter the Account Balance");
		    Balance=sc.nextInt();
		}
		void showDetails(){
			System.out.println("The Customer Details are");
	     	System.out.println("Account Number  :"+AccNo);
			System.out.println("Account Type    :"+AccType);
			System.out.println("Account Name    :"+AccName);
			System.out.println("Account Balance :"+Balance);
				}
	}
	class InvalidAmountException extends Exception{
			super(str);
		}
		
	}

