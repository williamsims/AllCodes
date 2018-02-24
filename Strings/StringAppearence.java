//**************************************************
//                        Homework
//  William Simunek                     12/8/17
//**************************************************
import java.util.Scanner;
public class StringAppearence
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String first, second;
        System.out.println("Enter your first string:");
        first = scan.nextLine().toLowerCase();
        System.out.println("Enter your second string:");
        second = scan.nextLine().toLowerCase();
        
        System.out.println("\"" + second + "\" appears " + first.indexOf(second) + " times");
    }
}