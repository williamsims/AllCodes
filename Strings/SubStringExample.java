//**************************************************
//                   Classwork
//  William Simunek                     12/8/17
//**************************************************
import java.util.Scanner;
public class SubStringExample
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String sentence, word;
        int start, end;
        System.out.println("Enter a string:");
        sentence = scan.nextLine();
        System.out.println("Enter start:");
        start = scan.nextInt();
        System.out.println("Enter end:");
        end = scan.nextInt();
        System.out.println(sentence.substring(start));
        System.out.println(sentence.substring(start,end));
    }
}