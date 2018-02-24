//**************************************************
//                  Classwork 11/16/17
//  William Simunek                     11/16/17
//**************************************************
public class Stars
{
    public static void main(String[] args)
    {
        for(int row = 10; row >= 1; row--)
        {
            for(int stars = row; stars > 0; stars--)
                System.out.print("*");
            System.out.println("\n");
        }
    }
}