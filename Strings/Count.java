//**************************************************
//              Homework
//  William Simunek                     12/6/17
//**************************************************
import java.util.Scanner;
public class Count
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String input;
        System.out.print("Enter a Sentence: ");
        input = scan.nextLine();
        int count = 1;
        char space = ' ';
        
        for(int i = 0; i < input.length(); i++)
            if(input.charAt(i) == space)
                count++;
        System.out.println("Your sentence has " + count + " words.");
        double[] test = new double[5];
        test[0] = 2;
        System.out.println(test[0]);
            
    }
}