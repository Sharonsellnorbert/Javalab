/*
 * File			:DoublyLinkList.java
 * Description	:Program to create a Doubly linked list
 * Author		:Sharon Sell Norbert
 * Version 		:1.0
 * Date			:8-12-2023
 */
package Helloworld;
import java.util.LinkedList;
import java.util.Scanner;
public class DoublyLinkList {
	public static void main(String[] args) {
		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
            System.out.println("1. Insertion at Front:");
            System.out.println("2. Insertion at Last:");
            System.out.println("3. Insertion at any Position:");
            System.out.println("4. Removal from any Position:");
            System.out.println("5. Display elements:");
            System.out.println("6. Exit");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            switch (ch) {
            case 1: 
            	System.out.println("Enter the Element:");
            	int elements=sc.nextInt();
            	doublyLinkedList.insertFront(elements);
            	break;
            case 2:
            	System.out.println("Enter the Element:");
            	elements=sc.nextInt();
            	doublyLinkedList.insertLast(elements);
            	break;
            case 3:
            	System.out.println("Enter the Element:");
            	elements=sc.nextInt();
            	System.out.println("Enter the Position:");
            	int p = sc.nextInt();
            	doublyLinkedList.insertAtAnyPosition(p,elements );
            	break;
            case 4:
            	System.out.println("Enter the Position:");
            	p = sc.nextInt();
            	doublyLinkedList.removeAtAnyPos(p);
            	break;
            case 5:
            	System.out.println("Doubly Linked List:");
            	doublyLinkedList.display();
            	break;
            default:
            	break;
            }
		} while(ch<6);
            	
	}
	
}
class DoublyLinkedList<T>{
	private LinkedList<T> list = new LinkedList<>();
	public void insertLast(T element) 
	{
		list.addLast(element);
	}
	public void insertFront (T element)
	{
		list.addFirst(element);
	}
	public void insertAtAnyPosition(int index, T element)
	{
		list.add(index, element);
	}
	public void  removeAtAnyPos(int index)
	{
	 System.out.println("Deleted ELEMENT IS :"+list.remove(index));
	 
	}
	public void display() 
	{
	 for(T element: list) {
		 System.out.println(element+" ");
	 }
	 System.out.println();
	}
}


