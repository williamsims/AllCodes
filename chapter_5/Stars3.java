//**************************************************
//                  Classwork 11/22/17
//  William Simunek                     11/22/17
//**************************************************
public class Stars3
{
    public static void main(String[] args)
    {
        int spaces, stars, row;
        
        for(row = 1; row <= 7; row ++)
        {
            for(spaces = (7 - row); spaces > 0; spaces --)
                System.out.print(" ");
            for(stars = row; stars > 0; stars--)    
                System.out.print("*");
            System.out.println("\n");
        }
    }
}