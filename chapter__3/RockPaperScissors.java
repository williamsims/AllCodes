//*******************************************
//  				Classwork
//  William Simunek				10/26/17
//********************************************
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random gen = new Random();
    int computerHand, playerHand, computerScore, playerScore, yesOrNo;
    System.out.println("In this game type \"1\" for rock, \"2\" for paper, and \"3\" for scissors.");
    System.out.println("Would you like to play Rock Paper Scissors best 2 out of 3? Type \"1\" for Yes and \"2\" for No.");
    yesOrNo = scan.nextInt();
    computerScore = 0;
    playerScore = 0;
    int firstYesOrNo = yesOrNo;
    
    while (yesOrNo == 1)
    {
      while (computerScore < 2 && playerScore < 2)
      {
        computerHand = gen.nextInt(3) + 1;
        System.out.println("Enter 1 for rock, 2 for paper, or 3 for scissors");
        playerHand = scan.nextInt();
        
        if (computerHand == playerHand)
          System.out.println("It is a draw! No one gets a point.");
        else if (computerHand == 1 && playerHand == 2)
        {
          playerScore ++;
          System.out.println("Your rock beats their paper! You win this round!");
        }
        else if (computerHand == 1 && playerHand == 3)
        {
          computerScore ++;
          System.out.println("Their rocks beats your paper! They win this round!");
        }
        else if (computerHand == 2 && playerHand == 1)
        {
          computerScore ++;
          System.out.println("Their paper beats your rock! They win this round!");
        }
        else if (computerHand == 2 && playerHand == 3)
        {
          playerScore ++;
          System.out.println("Your scissors beats their paper! You win this round!");
        }
        else if (computerHand == 3 && playerHand == 1)
        {
          playerScore ++;
          System.out.println("Your rock beats their scissors! You win this round!"); 
        }
        else if (computerHand == 3 && playerHand == 2)
        {
          computerScore ++;
          System.out.println("Their scissors beats your paper! They win this round");
        }
      }
      if (computerScore ==2)
        System.out.println("The computer wins the game!");
      else if (playerScore == 2)
        System.out.println("Congratulations!!!You win the game!");
      
      System.out.println("Would you like to play again? Enter 1 for yes and enter 2 for no.");
      yesOrNo = scan.nextInt();
      computerScore = 0;
      playerScore = 0;

    }
    
    if (firstYesOrNo == 1)
      System.out.println("Thanks for playing!");
    else if (firstYesOrNo == 2)
      System.out.println("You have decided not to play. Restart the program if you change your mind.");
    }
}