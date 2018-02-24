//*********************************
//      Practice
// William Simunek          11/14/17
//*********************************
import java.util.Scanner;
class WhilePractice 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);;
        int number, count = 1, answer = -1, answer2, firstDigit = 0;
        int lastDigit = 0;
        System.out.println("Enter a positive integer");
        number = scan.nextInt();
        while (answer != 0)
        {
            firstDigit = answer;
            answer = (number / count);
            count *= 10;
            
        }
        count /= 100;
        while (number >= 10)
        {
        	answer2 = (number / count);
        	number = number - (answer2 * count);
            count /= 10;
        }
        lastDigit = number / count;
        System.out.println("The first digit is:\t" + firstDigit + "\nThe last digit is:\t" + lastDigit);

    }
}