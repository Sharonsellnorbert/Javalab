/*
 * File			:Abstract.java
 * Description	:To use abstract and find no of sides of shapes
 * Author		:Sharon Sell Norbert
 * Version 		:1.0
 * Date			:27-10-2023
 */
package Helloworld;

public class Abstract {
 public static void main(String[]args) {
	 Rectangle rec=new Rectangle();
	 Triangle tri=new Triangle();
	 Hexagon hex=new Hexagon();
	 rec.numberOfSides();
	 tri.numberOfSides();
	 hex.numberOfSides();
	 
 }
}
 abstract class Shape {
	 abstract public void numberOfSides();
 }
 class Rectangle extends Shape {
	 public void numberOfSides() {
		 System.out.println("The Rectangle Has 4 Sides");
	 }
 }
 class Triangle extends Shape {
	 public void numberOfSides() {
		 System.out.println("The Triangle Has 3 Sides");
	 }
 }
 class Hexagon extends Shape {
	public void numberOfSides() {
		 System.out.println("The Hexagon Has 6 Sides");
	 }
 }

