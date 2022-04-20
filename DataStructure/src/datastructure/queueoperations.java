package datastructure;

import java.util.Scanner;

public class queueoperations {
	int front=0;
	int rear=-1;
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int queue[]=new int[size];
	
	/**
	 * Function for the value to be Enqueued
	 */
	
	public void enqueue(int val) {
		if(rear==size-1)
		{
			System.out.println("Queue is Overflowed");
		}
		else
		{
			queue[++rear]=val;
		}
	}
	
	/**
	 * Function for the value to be Dequeued
	 */
	
	public void dequeue() {
		if(front==rear+1)
		{
			System.out.println("Queue is Underflowed");
		}
		else
		{
			System.out.println(queue[front]);
			for(int i=0;i<queue.length;i++)
			{
				if(i==queue.length-1)
					queue[i]=0;
				else
					queue[i]=queue[i+1];
				
			}
			rear--;
		}
	}
	
	/**
	 * Function to display the values in the Queue
	 */
	
	public void display() {
		int i;
		for(i=0;i<size;i++)
		{
			System.out.println("Values in the Queue : ");
			System.out.println(queue[i]);
		}
	}
	
}
