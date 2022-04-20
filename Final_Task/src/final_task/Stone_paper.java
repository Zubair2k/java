package final_task;

import java.util.Scanner;
import java.util.Random;


public class Stone_paper {
	public Stone_paper() {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many times would you like to play Stone-Paper-Scissor?");
        int times = sc.nextInt();

        for (int i = 0; i < times; i++) {
            StonePaperScissors();
        }
    }
    static void StonePaperScissors() {
    	Scanner sc = new Scanner(System.in);
    	
    	/**
    	 * Getting input from the user.
    	 */
    	
        System.out.println("Player choice.\nType Your Choice:\nrock(or)paper(or)scissors");
        String player= sc.nextLine();
        
        /**
         * Getting input from the computer.
         */
        
        Random random = new Random();
        int randomValue = random.nextInt(3);

        String computer;
        if (randomValue == 0)
        {
            computer = "rock";
        }
        else if (randomValue == 1) 
        {
            computer = "paper";
        }
        else
        {
            computer = "scissors";
        }
        System.out.println("Computer choose " + computer + ".");

        /**
         * Print the Result of the game.
         */
        
        if (player.equals(computer))
        {
            System.out.println("Match is draw\n");
        }
        else if (playerVictory(player, computer))
        {
            System.out.println("Player Wins\n");
        }
        else
        {
            System.out.println("Computer Wins\n");
        }
    }

    /**
     * Checks the Result of the game.
     */
    
    static boolean playerVictory(String player, String computer) {
        if (player.equals("rock")) 
        {
            return computer.equals("scissors");
        } 
        else if (player.equals("paper")) 
        {
            return computer.equals("rock");
        }
        else
        {
            return computer.equals("paper");
        }
    }
}
