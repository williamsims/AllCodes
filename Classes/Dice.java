//
//
import java.util.Random;
public class Dice
{
    Random gen = new Random();
    private int side;

    public void dice()
    {
        side = 1;
    }
    public void roll()
    {
        side = gen.nextInt(6) + 1;
    }
    public int getSide()
    {
        return side;
    }
    public String toString()
    {
        return  side + "";
    }
}
