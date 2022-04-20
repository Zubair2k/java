package datastructure;

import java.util.Scanner;

public class stack {
	public static void main(String[] args)
	{
		stackoperations stop=new stackoperations();  //creating object for another class
		Scanner sc=new Scanner(System.in);
		
		/**
		 *  Getting the action to be done from user
		 */
		
		while(true)
		{
			System.out.println("\n1.Push \n2.Pop\n3.Peek\n4.Display");
			System.out.println("Enter the option :");
			int n=sc.nextInt();
			switch(n) {
			
			/**
			 *  The value will be pushed inside the stack
			 */
			case 1 :
				System.out.println("Enter the value to be pushed: ");
				int val=sc.nextInt();
				stop.push(val);
				break;
	
			/**
			 *  The value will be popped from the stack
			 */
			
			case 2 :
				stop.pop();
				break;
			
			/**
			 *  Display the top value of the stack
			 */			
	
			case 3 :
				stop.peek();
				break;
				
			/**
			 *  Display the values in the Stack
			 */
			
			case 4 :
				stop.display();
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
