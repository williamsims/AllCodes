//**************************************************
//             classwork
//  William Simunek                     1/11/18
//**************************************************
import java.util.Scanner;
public class MorePractice
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[16];
        System.out.println("Enter an integer from 0 - 15:");
        int input = scan.nextInt();
        while(input >= 0 && input <= 15)
        {
            numbers[input] ++;
            System.out.println("Enter an integer from 0 - 15, enter a number out of this range to exit loop:");
            input = scan.nextInt();
        }
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println(i + " was entered " + numbers[i] + " times");
        }
        
    }
}