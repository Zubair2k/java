package datastructure;

import java.util.Scanner;

public class stackoperations {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int stack[]=new int[size];
	int top=-1;
	
	/**
	 * Function for the value to be pushed inside the stack
	 */
	
	public void push(int val)
	{
		if(top==size-1)
		{
			System.out.println("Stack is Overflowed");
		}
		else
		{
			stack[++top]=val;
		}
	}
	
	/**
	 * Function for the value to be popped from the stack
	 */
	
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is Underflowed");
		}
		else
		{
			System.out.println(stack[top]);
			stack[top--]=0;
		}
	}
	
	/**
	 * Function to display the top value of the stack
	 */
	
	public void peek()
	{
		System.out.println(stack[top]);
	}
	
	/**
	 * Function to display the values in the Stack
	 */
	
	public void display()
	{
		int i;
		for(i=0;i<size;i++)
		{
			System.out.println("Values in the Stack : ");
			System.out.println(stack[i]);
		}
	}
}
