package Helloworld;
import java.util.Scanner;
public class ExceptioHandling {
public static void main(String []args) {
    char choice='y';
	while(choice=='y') {
	int num1,num2,result;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter First Number");
    num1=sc.nextInt();
    System.out.println("Enter the Second Number");
    num2=sc.nextInt();
    try {
    	result=num1/num2;
    	System.out.println("Result="+result);
    }
    catch(Exception e){
    	System.out.println("/ by Zero");
    }
    finally{
    System.out.println("End Of Operation");
    }
    System.out.println("Do you want to continue [y/n]");
    choice=sc.next().charAt(0);
	if (choice=='n')
	   {
		break; 
	   }
    }
}
}
