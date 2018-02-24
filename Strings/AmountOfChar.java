//**************************************************
//              Homework
//  William Simunek                     12/6/17
//**************************************************
import java.util.Scanner;
public class AmountOfChar
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String input;
        char current;
        int appear = 0;
        System.out.println("Enter a String: ");
        input = scan.nextLine().toLowerCase();
        System.out.println("Enter a Character: ");
        char character = scan.next().toLowerCase().charAt(0);
        
        for(int i = 0; i < input.length(); i++)
        {
            current = input.charAt(i); 
            if(current == character)
                appear++;
        }
        System.out.println("\"" + character + "\"" + " appears " + appear + " times" );
    }
}