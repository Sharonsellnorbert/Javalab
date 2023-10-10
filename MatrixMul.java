/*
 * File			:MatrixMul.java
 * Description	:Doing Matrix Multiplication
 * Author		:Sharon Sell Norbert
 * Version 		:1.0
 * Date			:10-10-2023
 */
package Helloworld;
import java.util.Scanner;
public class MatrixMul {
	public static void main(String[]args) {
		int Row_Size1,Column_Size1,Row_Size2,Column_Size2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row and Column Size of First Matrix");
		Row_Size1=sc.nextInt();
		Column_Size1=sc.nextInt();
		int [][]Matrix=new int[Row_Size1][Column_Size1];
		System.out.println("Enter the  first matrix");
		for(int i=0;i<Row_Size1;i++) {
			for(int j=0;j<Column_Size1;j++) {
				Matrix[i][j]=sc.nextInt();
			
			}
		}
		System.out.println("The First Matrix is");
		for(int i=0;i<Row_Size1;i++) {
			for(int j=0;j<Column_Size1;j++) {
				System.out.print(Matrix[i][j]+"\t");
			}
	    System.out.print("\n");
		}
		System.out.println("Enter the Row and Column Size of Second Matrix");
		Row_Size2=sc.nextInt();
		Column_Size2=sc.nextInt();
		System.out.println("Enter the Second Matrix");
		int [][]Matrix2=new int[Row_Size2][Column_Size2];
		for(int i=0;i<Row_Size2;i++) {
			for(int j=0;j<Column_Size2;j++) {
				Matrix2[i][j]=sc.nextInt();
			
			}
		}
		System.out.println("The Second Matrix is");
		for(int i=0;i<Row_Size2;i++) {
			for(int j=0;j<Column_Size2;j++) {
				System.out.print(Matrix2[i][j]+"\t");
			}
	    System.out.print("\n");
		}
		if(Column_Size1==Row_Size2) {
		int [][]Matrix3=new int[Row_Size1][Column_Size2];
		System.out.println("The matrix after multipilcation is");
		for(int i=0;i<Row_Size1;i++) {
			for(int j=0;j<Column_Size2;j++) {
				for(int k=0;k<Column_Size1;k++) {
					Matrix3[i][j]=Matrix3[i][j]+Matrix[k][j]*Matrix2[i][k];
				}
			}
		}
			for(int i=0;i<Row_Size1;i++) {
				for(int j=0;j<Column_Size2;j++) {
					System.out.print(Matrix3[i][j]+"\t");
				}
				System.out.println("\n");
			}
		}
		else {
			System.out.println("Multiplication Not Possible");
		}
	}
}

