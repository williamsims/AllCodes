//**************************************************
//              homework
//  William Simunek                     1/9/18
//**************************************************
import java.util.Scanner;

public class ArrayPractice
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String phrase;
        System.out.println("Enter a String: ");
        phrase = scan.nextLine();
        char[] letters = new char[phrase.length()];
        for(int i = 0; i < letters.length; i ++)
        {
            letters[i] = phrase.charAt(i);
        }
        for(int i = 0; i < letters.length; i ++)
            System.out.println(letters[i]);
    }
}