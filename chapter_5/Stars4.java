//**************************************************
//                  Classwork 11/16/17
//  William Simunek                     11/16/17
//**************************************************
public class Stars4
{
    public static void main(String[] args)
    {
        int spaces, stars, row;
        
        for(row = 1; row <= 7; row += 2)
        {
            for(spaces = (7 - row); spaces > 0; spaces -= 2 )
                System.out.print(" ");
            for(stars = row; stars > 0; stars--)    
                System.out.print("*");
            System.out.println("\n");
        }
        
        for(row = 5; row >= 1; row -= 2)
        {
            for(spaces = (7 - row); spaces > 0; spaces -= 2 )
                System.out.print(" ");
            for(stars = row; stars > 0; stars--)    
                System.out.print("*");
            System.out.println("\n");
        }
    }
}