//
//
public class DiceRunner
{
    public static void main(String[] args)
    {
        Dice d1 = new Dice(6);
        Dice d2 = new Dice(6);
        int player1 = 0;
        int player2 = 0;
        while (player1 < 10 && player2 < 10)
        {
            d1.roll();
            System.out.println("Player 1 rolled a " + d1.getSide());
            d2.roll();
            System.out.println("Player 2 rolled a " + d2.getSide());
            
            if (d1.getSide() > d2.getSide())
            {
                player1 ++;
                System.out.println("Player 1 rolled a high number, they get the point.\n");
            }
            else if (d2.getSide() > d1.getSide())
            {
                player2 ++;
                System.out.println("Player 2 rolled a high number, they get the point.\n");
            }
            else
                System.out.println("It is a tie, no one gets a point\n");
                
            if(player1 < 10 && player2 < 10)
                System.out.println("Current score:\nPlayer 1:\t" + player1 + "\nPlayer 2:\t" + player2 + "\n");
            else
                System.out.println("Final score:\nPlayer 1:\t" + player1 + "\nPlayer 2:\t" + player2 + "\n");
        }
    }
}