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
			int ROW1,COLUMN1,ROW2,COLUMN2;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Row and Column Size of First Matrix");
			ROW1=sc.nextInt();
			COLUMN1=sc.nextInt();
			int [][]matrix1=new int[ROW1][COLUMN1];
			System.out.println("Enter the  first matrix");
			for(int i=0;i<ROW1;i++) {
				for(int j=0;j<COLUMN1;j++) {
					matrix1[i][j]=sc.nextInt();
				
				}
			}
			System.out.println("The First Matrix is");
			for(int i=0;i<ROW1;i++) {
				for(int j=0;j<COLUMN1;j++) {
					System.out.print(matrix1[i][j]+"\t");
				}
		    System.out.print("\n");
			}
			System.out.println("Enter the Row and Column Size of Second Matrix");
			ROW2=sc.nextInt();
			COLUMN2=sc.nextInt();
			System.out.println("Enter the Second Matrix");
			int [][]Matrix2=new int[ROW2][COLUMN2];
			for(int i=0;i<ROW2;i++) {
				for(int j=0;j<COLUMN2;j++) {
					Matrix2[i][j]=sc.nextInt();
				
				}
			}
			System.out.println("The Second Matrix is");
			for(int i=0;i<ROW2;i++) {
				for(int j=0;j<COLUMN2;j++) {
					System.out.print(Matrix2[i][j]+"\t");
				}
		    System.out.print("\n");
			}
			if(COLUMN1==ROW2) {
			int [][]Matrix3=new int[ROW1][COLUMN2];
			System.out.println("The matrix after multipilcation is");
			for(int i=0;i<ROW1;i++) {
				for(int j=0;j<COLUMN2;j++) {
					for(int k=0;k<COLUMN1;k++) {
						Matrix3[i][j]=Matrix3[i][j]+matrix1[k][j]*Matrix2[i][k];
					}
				}
			}
				for(int i=0;i<ROW1;i++) {
					for(int j=0;j<COLUMN2;j++) {
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
