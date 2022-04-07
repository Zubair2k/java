package datastructure;

import java.util.*;
import java.util.Scanner;

public class linkedlist {
	public static void main(String[] args)
	{
		lloperations llops=new lloperations(); //creating object for another class
		Scanner sc=new Scanner(System.in);
		
		/**
		 *  Getting the action to be done from user
		 */
		
		while(true)
		{
			System.out.println("\n1.Insert value in the Beginning \n2.Insert value at last\n3.Insert value at middle\n4.Delete value in the Beginning \n5.Delete value at last\n6.Delete value at middle\n7.Check the value is present in the list or not\n8.Display the value\n9.Count the values in the list");
			System.out.println("Enter the option :");
			int n=sc.nextInt();
			switch(n) {
				
				/**
				 *  Inserting value At Beginning
				 */
				
				case 1 :
					System.out.println("Enter the value to be inserted at first: ");
					int beg=sc.nextInt();
					llops.insertAtBeginning(beg);
					break;

				/**
				 *  Inserting value At Last
				 */
						
				case 2 :
					System.out.println("Enter the value to be inserted at end : ");
					int end=sc.nextInt();
					llops.insertAtLast(end);
					break;

				/**
				 *  Inserting value At Middle
				 */
											
				case 3 :
					System.out.println("Enter the value to be inserted at middle : ");
					int mid=sc.nextInt();
					System.out.println("Enter the value to be inserted to a specified position : ");
					int pos=sc.nextInt();
					llops.insertAtMiddle(mid,pos);
					break;

				/**
				 *  Deleting value At Beginning
				 */
								
				case 4 :
					llops.deleteAtBeginning();
					break;
		
				/**
				 *  Deleting value At Last
				 */
					
				case 5 :
					llops.deleteAtLast();
					break;
					
				/**
				 *  Deleting value At Middle
				 */
		
				case 6:
					System.out.println("Enter the value to be delete to a specified position : ");
					int pos1=sc.nextInt();
					llops.deleteAtMiddle(pos1);
					break;
				
				/**
				 *  Searching the value int the list whether the value is present in the list or not 
				 */
				
				case 7 :
					System.out.println("Enter the value to be searched : ");
					int srch=sc.nextInt();
					llops.search(srch);
					break;
				
				/**
				*  Display the values in the list
				*/
					
				case 8 :
					llops.display();
					break;
				
				/**
				 *  Count the values in the list
				 */
					
				case 9 :
					llops.countNode();
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
