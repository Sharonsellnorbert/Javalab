package Helloworld;
import java.util.Scanner;
public class BankException {
	public static void main(String[]args) {
	int Choice,size;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number of Customers");
	size=sc.nextInt();
	Customer c=new Customer();
	for(int i=0;i<size;i++) {
	 c[i].getCustomerDetails();
	}
	System.out.println("1.Display all account details\n2.Search by account number\n3.Deposit the amount\n4.Withdraw the amount\n5.Exit\n");
	System.out.println("Enter the choice");
    Choice=sc.nextInt();
	while(Choice!=5){
		 if(Choice==1) {
			 for(int i=0;i<size;i++) {
				 c[i].showDetails();	
			 }
		 }
		 else if(Choice==2) {
			 
		 }
         else if(Choice==3) {
	 
         }
         else if(Choice==4) {
	 
         }
	 }
	 
	 }

}
class Customer{
    int AccNo,Balance;
    String AccType,AccName;
    Scanner sc=new Scanner(System.in);
	void getCustomerDetails() {
	AccNo=sc.nextInt();
	System.out.println("Enter the Account Type");
	AccType=sc.next();
	System.out.println("Enter the Account Name");
	AccName=sc.next();
	System.out.println("Enter the Account Balance");
	Balance=sc.nextInt();
	}
	void showDetails(){
     	System.out.println("Account Number  :"+AccNo);
		System.out.println("Account Type    :"+AccType);
		System.out.println("Account Name    :"+AccName);
		System.out.println("Account Balance :"+Balance);
			}
}
