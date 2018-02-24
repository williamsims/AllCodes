//**************************************************
//                   Classwork
//  William Simunek                     12/8/17
//**************************************************
import java.util.Scanner;
public class SubString
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String first, second;
        System.out.println("Enter your first string:");
        first = scan.nextLine().toLowerCase();
        System.out.println("Enter your second string:");
        second = scan.nextLine().toLowerCase();
        
        if (first.indexOf(second) >= 0)
            System.out.println(second + " is a substring of " + first);
        else
            System.out.println(second + " is not a substring of " + first);
        System.out.println(first.indexOf(second));

        
    }
}