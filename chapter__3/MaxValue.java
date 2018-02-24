//*********************************
//      Programming Project 4
//  William Simunek     11/14/2017
//*********************************
import java.util.Scanner;
public class ProgrammingProject4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int number, occurrence = 0, largest = 0, firstNumber;
        
        System.out.println("Enter an integer, Enter 0 to end the program:");
        number = scan.nextInt();
        firstNumber = number;
        
        while (number != 0)
        {
            if (number > largest)
            {
                largest = number;
                occurrence = 0;
            }
            if (number == largest)
                occurrence ++;
            System.out.println("Enter another integer, enter 0 to end entering numbers");
            number = scan.nextInt();
        }
        if (firstNumber != 0)
        {
            System.out.println("The largest number is " + largest);
            System.out.println("The occurrence count for the largest number is " + occurrence);
        }
        else
            System.out.println("You have decided to end the program without entering any integers");
    }
}
