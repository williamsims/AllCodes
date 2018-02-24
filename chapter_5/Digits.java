//**************************************************
//                  Classwork 11/16/17
//  William Simunek                     11/16/17
//**************************************************
import java.util.Scanner;
public class Digits
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a multi digit number:");
        int number = scan.nextInt(); 
        System.out.println("The last digit is " + (number % 10));
        int i;
        
        for(i = number; i > 10; i /= 10)
        {
        }
        System.out.println("The first digit is " + i);
    }
}