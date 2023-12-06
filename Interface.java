/*
 * File			:Interface.java
 * Description	        :To illustrate interface inheritance
 * Author		:Sharon Sell Norbert
 * Version 		:1.0
 * Date			:10-11-2023
 */
package Helloworld;
public class Interface {
	public static void main(String[]args) {
		Fish fish = new Fish();
		System.out.println("FISH");
		fish.setName("Mimi");
		System.out.println("This fish's name is "+fish.getname());
		fish.eat();
		fish.walk();
		fish.setName("Momo");
		System.out.println("This fish's name is "+fish.getname()); 
		Cat c = new Cat("Fluffy");
		System.out.println("CAT");
		c.setName("Fluffy");
		System.out.println("This fish's name is "+c.getname());
		c.eat();
		c.walk();
		c.setName("Moose");
		System.out.println("This fish's name is"+c.getname()); 
	    Spider s= new Spider();
		System.out.println("SPIDER");
		s.eat();
		s.walk();
	}
	
}
abstract class Animal{
	protected int legs;
	protected Animal(int legs) {
		this.legs=legs;
	}
	public abstract void eat();
	public void walk() {
		System.out.println("This Animal walks by "+legs+" legs");
	}
}
class Spider extends Animal{
	Spider(){
		super(8);
	}
	public void eat() {
		System.out.println("The Spider Eats");
	}
}
interface Pet{
	String getname();
	void setName(String name);
	void plays();
	}
class Cat extends Animal implements Pet{
private String name;
	public 	Cat(String name) {
		super(4);
		this.name=name;
	}
	Cat() {
		this("");
	}
	@Override
	public void eat() {
		System.out.println("The Cat is eating");
	}
	public void setName(String name) {
		 this.name=name;
	}

	@Override
	public String getname() {
		return this.name;
	}
	@Override
	public void plays(){
		System.out.println("The Cat plays");
	}

	public void walk() {
		System.out.println("The Cat walks by "+legs+" legs");
	}
	
}
class Fish extends Animal implements Pet{
	private String name;
	public Fish() {
		super(0);
	}
	public void eat() {
		System.out.println("Fish Eats Plants");
	}
	public void setName(String name) {
		this.name=name;
	}
	@Override
	public String getname() {
		return this.name;
	}
	@Override
	public void walk() {
		System.out.println("Fish has no legs");
	}
	@Override
	public void plays() {
		System.out.println("The Fish is Playing");
	}
	
}
