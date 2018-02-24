//**************************************************
//                  Classwork 11/16/17
//  William Simunek                     11/16/17
//**************************************************
public class Stars2
{
    public static void main(String[] args)
    {
        int stars, row;
        
        for(row = 1; row <= 10; row++)
        {
            for(stars = row; stars > 0; stars--)
                System.out.print("*");
            System.out.println("\n");
        }
    }
}