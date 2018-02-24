//*********************************
//William Simunek
//Homework      1/22/18
//*********************************
public class Card
{
    private int cardValue;
    private int suit;
    private String suitName;
    //0=Diamonds, 1=Hearts, 2=spades, 3=clubs
    
    public Card(int c, int s)
    {
        cardValue = c;
        suit = s;
    }
    public int getCardValue()
    {
        return cardValue;
        
    }
    public int getSuit()
    {
       return suit;
    }
    public String toString()
    {
        if(suit == 0)
            suitName = "Diamonds";
        else if(suit == 1)
            suitName = "Hearts";
        else if(suit == 2)
            suitName = "Spades";
        else if(suit== 3)
            suitName = "Clubs";
        
        return cardValue + " of " + suitName;
    }
}