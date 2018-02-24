//**************************************************
//                  Classwork 11/22/17
//  William Simunek                     11/22/17
//**************************************************
public class Stars5
{
    public static void main(String[] args)
    {
        int row, spaces, stars;
        
        for(row = 10; row >= 1; row--)
        {
            for(spaces = (10 - row); spaces >= 0; spaces--)
                System.out.print(" ");
            for(stars = row; stars > 0; stars--)
                System.out.print("*");
            System.out.println("\n");
        }
    }
}