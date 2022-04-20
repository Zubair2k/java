package datastructure;

import java.util.Scanner;

public class Queue {
	public static void main(String[] args)
	{
		queueoperations quops=new queueoperations(); //creating object for another class
		Scanner sc=new Scanner(System.in);
		
		/**
		 *  Getting the action to be done from user
		 */
		
		while(true)
		{
			System.out.println("\n1.Enqueue\n2.Dequeue\n3.Display");
			System.out.println("Enter the option :");
			int n=sc.nextInt();
			switch(n) 
			{
			
				/**
				 *  The value will be Enqueued
				 */
			
				case 1 :
					System.out.println("Enter the value to be enqueued : ");
					int val=sc.nextInt();
					quops.enqueue(val);
					break;
				
				/**
				 *  The value will be Dequeued
				 */
		
				case 2 :
					quops.dequeue();
					break;
				/**
				 *  Display the values in the Queue
				 */
				
				case 3 :
					quops.display();
					break;
		
				/**
				 *  Default option is performed when the given option is wrong 
				 */
					
				default:
					System.out.println("Selected Option is wrong.\nGive Correct Option.\n");
			}
		}
	}
}
