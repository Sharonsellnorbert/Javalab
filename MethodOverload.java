/*
 * File			:MethodOverload.java
 * Description	:Finding Area using Method Overload
 * Author		:Sharon Sell Norbert
 * Version 		:1.0
 * Date			:10-10-2023
 */
package Helloworld;
import java.util.Scanner;
public class MethodOverload {
	public static void main(String[]args) {
		int Length,Width;
		float base,height,radius;
		Area area=new Area();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the width");
		Width=sc.nextInt();
		System.out.println("Enter the radius");
		radius=sc.nextFloat();
		System.out.println("Enter the length");
		Length=sc.nextInt();
		System.out.println("Enter the height");
		height=sc.nextFloat();
		System.out.println("Enter the Base");
		base=sc.nextFloat();
		Area.area(Width,Length);
		Area.area(base,height);
		Area.area(radius);
		
		
	}
}
	class Area{
		public static void area(int width,int length) {
			System.out.println("Area of Rectangle is "+width*length);
			
		}
		public static void area(float base,float height) {
			System.out.println("Area of Triangle is "+(0.5*base*height));
		}
		public static void area(float radius) {
			System.out.println("Area of Circle is "+(3.14*radius*radius));
		}
		
	}

