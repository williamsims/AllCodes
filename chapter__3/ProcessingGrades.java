//*******************************************
//  		Programming Project 3
//  William Simunek				11/3/17
//********************************************
import java.util.Scanner;
public class ProcessingGrades
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int amountEntered = 0, currentTotal = 0, enteredGrade;
        System.out.println("Enter a grade, enter \"-1\" to end the program now");
        enteredGrade = scan.nextInt();
        
        if (enteredGrade < 0)
            System.out.println("You have decided to enter zero grades");
        else
        {
            while (enteredGrade >= 0)
            {
            amountEntered ++;
            currentTotal = (currentTotal + enteredGrade);
            System.out.println("Enter another grade, if you would like to end enter \"-1\"");
            enteredGrade = scan.nextInt();
            }
            System.out.println("Total Number of Scores:\t" + (amountEntered));
            System.out.println("Grade Average:\t\t" + (currentTotal / amountEntered));
        }
    }
}
