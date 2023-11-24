package Helloworld;

import java.util.Scanner;
class Customer{
	Scanner sc=new Scanner(System.in);
	Long acnum;
	String actype;
	String name;
	Long balance;
	public void getdetails() {
		System.out.println("Enter Name:");
		name=sc.nextLine();
	    System.out.println("enter the account no:");
	    acnum=sc.nextLong();
	    System.out.println("enter the account type:");
	    actype=sc.next();
	    System.out.println("Enter Balance:");
	    balance=sc.nextLong();
	}
	public void printdetails() {
		System.out.println("The customer details are:");
		System.out.println("Name of account holder:"+name);
		System.out.println("Account no:"+acnum);
		System.out.println("Account type:"+actype);
		System.out.println("Account Balance:"+balance);
		System.out.println();
		}
}
//custom exceptions
class InvalidAmountException extends Exception {
	InvalidAmountException (String s){
        	 super(s);
         }
}
class InsufficientFundsException extends Exception {
	InsufficientFundsException (String s){
        	 super(s);
         }
}
public class CustomException{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		InvalidAmountException amountException=new InvalidAmountException("Invalid Amount Exception");
		InsufficientFundsException fundsException=new InsufficientFundsException("Insufficient Funds Exception");
		int choice;
		System.out.println("How many number of customers do you want to input");
		int num=sc.nextInt();
		Customer[] customer=new Customer[num];//array of objects
		for(int i=0;i<num;i++) {
			customer[i]=new Customer();//create object only to get details
			customer[i].getdetails();
		}
		do {
		System.out.println("***Banking System Application***\n"
				+ "1. Display all account details \n"
				+ " 2. Search by Account number\n"
				+ " 3. Deposit the amount \n"
				+ " 4. Withdraw the amount \n"
				+ " 5.Exit \n"
				+ "Enter your choice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:{
			for(int i=0;i<num;i++) {
			customer[i].printdetails();
			}
			break;
		}
			case 2:{
				System.out.println("Enter the Account Number:");
				long a=sc.nextLong();
				for(int i=0;i<num;i++) {
					if(a==customer[i].acnum) {
						customer[i].printdetails();
					}
				}
				break;
			}
			case 3:{
				System.out.println("Enter the Account Number:");
				long a=sc.nextLong();
				try {
				System.out.println("Enter the amount you want to deposit:");
				long amount=sc.nextLong();
				if(amount<=0) {
					throw amountException;
				}
				else {
				for(int i=0;i<num;i++) {
					if(a==customer[i].acnum) {
						customer[i].balance=customer[i].balance+amount;
						customer[i].printdetails();
						}
				}	
				}
			}catch(InvalidAmountException e) {
				System.out.println(e.getMessage());
			}
				break;
			}
			case 4:{
				System.out.println("Enter the Account Number:");
				long a=sc.nextLong();
				try {
					System.out.println("Enter the amount you want to withdraw:");
					long amount=sc.nextLong();
					if(amount<=0) {
						throw amountException;
					}
					else {
						for(int i=0;i<num;i++) {
							if(amount>customer[i].balance) {
								throw fundsException;
							}
							else if(a==customer[i].acnum) {
								customer[i].balance=customer[i].balance-amount;
								customer[i].printdetails();
								}
						}	
					}
			}catch(InvalidAmountException e) {
				System.out.println(e.getMessage());
			}catch(InsufficientFundsException e) {
				System.out.println(e.getMessage());
			}
				break;
		}default:
			break;
			}
		
	}while(choice<5);
}
}
/*How many number of customers do you want to input
2
Enter Name:
SMITHA
enter the account no:
123
enter the account type:
SB
Enter Balance:
10000
Enter Name:
JACOB
enter the account no:
124
enter the account type:
CA
Enter Balance:
20000
***Banking System Application***
 1. Display all account details
 2. Search by Account number
 3. Deposit the amount 
 4. Withdraw the amount 
 5.Exit 
Enter your choice:
1
The customer details are:
Name of account holder:SMITHA
Account no:123
Account type:SB
Account Balance:10000

The customer details are:
Name of account holder:JACOB
Account no:124
Account type:CA
Account Balance:20000

***Banking System Application***
 1. Display all account details
 2. Search by Account number
 3. Deposit the amount 
 4. Withdraw the amount 
 5.Exit 
Enter your choice:
2
Enter the Account Number:
123
The customer details are:
Name of account holder:SMITHA
Account no:123
Account type:SB
Account Balance:10000

***Banking System Application***
 1. Display all account details
 2. Search by Account number
 3. Deposit the amount 
 4. Withdraw the amount 
 5.Exit 
Enter your choice:
3
Enter the Account Number:
123
Enter the amount you want to deposit:
5000
The customer details are:
Name of account holder:SMITHA
Account no:123
Account type:SB
Account Balance:15000

***Banking System Application***
 1. Display all account details
 2. Search by Account number
 3. Deposit the amount 
 4. Withdraw the amount 
 5.Exit 
Enter your choice:
3
Enter the Account Number:
0
Enter the amount you want to deposit:
0
Invalid Amount Exception
***Banking System Application***
 1. Display all account details
 2. Search by Account number
 3. Deposit the amount 
 4. Withdraw the amount 
 5.Exit 
Enter your choice:
4
Enter the Account Number:
123
Enter the amount you want to withdraw:
4000
The customer details are:
Name of account holder:SMITHA
Account no:123
Account type:SB
Account Balance:11000

***Banking System Application***
 1. Display all account details
 2. Search by Account number
 3. Deposit the amount 
 4. Withdraw the amount 
 5.Exit 
Enter your choice:
4
Enter the Account Number:
123
Enter the amount you want to withdraw:
0
Invalid Amount Exception
***Banking System Application***
 1. Display all account details
 2. Search by Account number
 3. Deposit the amount 
 4. Withdraw the amount 
 5.Exit 
Enter your choice:
5
*/
