//***************************************
//      Hangman code
//William Simunek       12/20/17
//**************************************
import java.util.Scanner;
public class HangmanGame
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String sentence, sentBlanks="", temp ="", entry="";
        char x;
        int incorrect = 0, finds = 0;
        System.out.print("Player 1, enter sentence: ");
        sentence = scan.nextLine().toLowerCase();
        System.out.println("*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*");
        System.out.println("Player 2, you have 6 guesses to"
                            + " figure out the answer.");
        //replaces all letters in sentence with *
        for(int i = 0; i < sentence.length(); i++)
        {
            if(sentence.charAt(i) >= 65 && sentence.charAt(i) <= 122)
            {
                sentBlanks += "*";
            }
            else
            {
                sentBlanks += sentence.charAt(i);
            }
        }
        System.out.println(sentBlanks);
        
        while (sentBlanks.indexOf("*") >= 0 && incorrect < 6)
        {
            System.out.print("Enter a letter or guess the answer: ");
            entry = scan.nextLine().toLowerCase();
	    // This will exit the loop if the player enters something longer than a character.
	    // i.e. they made a guess of the answer.
            if (entry.length() > 1)
                break;
            for(int i = 0; i < sentence.length(); i++)
            {
                x = entry.charAt(0);
                if(x == sentence.charAt(i))
                {
                    sentBlanks = sentBlanks.substring(0,i) + x + sentBlanks.substring(i +1, sentence.length()); 
                    finds ++;
                }
            }
            System.out.println(sentBlanks); 
            if (finds == 0)
                incorrect ++;
            finds = 0;
            System.out.println("You have entered " + incorrect + " incorrect guesses. You now have " + (6 - incorrect) + " guesses remaining");
        }
        
        int compare = sentence.compareTo(entry);
        int compare2 = sentence.compareTo(sentBlanks);
        if(compare == 0)
            System.out.println("You Win!!");
        else if(compare2 == 0)
            System.out.println("You Win!!");
        else 
            System.out.println("You Lose!! The correct sentence is " + sentence);
    }
}