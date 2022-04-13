package final_task;

import java.util.Scanner;


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
					new Stone_paper();
					break;
				case 2 :
					new Picture_puzzle();
					break;
				default:
					System.out.println("Selected Option is wrong.\nGive Correct Option.\n");
			}
		}
	}
}
