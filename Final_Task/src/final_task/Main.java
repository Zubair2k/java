package final_task;

import java.util.Scanner;

/**
 * This is a class where you can select the game you need.
 */
public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("\n1.Play Stone-Paper-Scissor\n2.Play Picture Puzzle\n");
			System.out.println("Enter the option :");
			int n=sc.nextInt();
			switch(n) 
			{
				case 1 :
					new Stone_paper();			//Calling a function of another class
					break;
				case 2 :
					new Picture_puzzle();		//Calling a function of another class
					break;
				default:
					System.out.println("Selected Option is wrong.\nGive Correct Option.\n");
			}
		}
	}
}
