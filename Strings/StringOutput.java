//**************************************************
//              Classwork
//  William Simunek                     12/6/17
//**************************************************
import java.util.Scanner;
public class StringOutput
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String input;
        int start = 0, end;
        System.out.print("Enter a String: ");
        input = scan.nextLine();
        
        for(int i = 0; i < input.length(); i++)
        {
            System.out.println(input.charAt(i) + "\t" + i);

        }
        
    }
}