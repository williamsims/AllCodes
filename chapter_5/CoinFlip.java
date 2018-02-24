import java.util.Scanner;
import java.util.Random;
//**************************************************
//                  Classwork 11/28/17
//  William Simunek                     11/28/17
//**************************************************
public class CoinFlip
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random gen = new Random();
        System.out.println("Enter how many timews you want to flip a coin:");
        int flips = scan.nextInt();
        
        int heads = 0, tails = 0, coin = 0;
        for(int i = 0; i < flips; i++)
            {
                coin = gen.nextInt(2);
                
                if (coin == 0)
                    heads ++;
                else
                    tails ++;
            }
        System.out.println("Number of heads:\t" + heads + "\nNumber of tails:\t" + tails);
    }
}