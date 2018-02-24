//**************************************************
//                  Homework 11/16/17
//  William Simunek                     11/16/17
//**************************************************
import java.util.Scanner;
public class AllFactors
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Integer:");
        int number = scan.nextInt();
        int i, factor;
        System.out.print("The factors of " + number + ": ");
        for (i = 1; i <= number; i++)
        {
            factor = number % i;
            if (factor == 0)
                System.out.print(i + ", ");
        }
    }
}