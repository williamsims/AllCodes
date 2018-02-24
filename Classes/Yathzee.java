//
//
import java.util.Scanner;
public class Yathzee
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Dice d1 = new Dice();
        Dice[] diceSet = new Dice[5];
        
        for(int i = 0; i < diceSet.length; i++)
        {
            diceSet[i] = new Dice();
        }
        for(int i = 0; i < diceSet.length; i++)
        {
            diceSet[i].roll();
            System.out.println("Dice " + (i + 1) + " = " + diceSet[i]);
        }
        System.out.println("Which ones would you like to re-roll?");
        String reroll = scan.nextLine();
        String number;
        int num;
        
        for(int i = 0; i < reroll.length(); i++)
        {
            number = reroll.charAt(i) + "";
            num = Integer.parseInt(number);
            diceSet[num - 1].roll();
        }
        for(int i = 0; i < diceSet.length; i++)
        {
            System.out.println("Dice " + (i + 1) + " = " + diceSet[i] );
        }
        int count = 0;
        int count2 = 0;
        int max = 0;
        int face = diceSet[0].getSide();
        for(int i = 0; i < diceSet.length; i++)
        {
            for(int j = 0; j < diceSet.length; j++)
            {
                if(diceSet[i] == diceSet[j])
                {
                    count++;
                }
            }
            if(count > max)
            {
                max = count;
                face = diceSet[i].getSide();
                
            }
            count = 0;
        }
        System.out.println("You rolled " + count + " " + face + "'s");
    }
}