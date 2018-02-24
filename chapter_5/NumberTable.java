//**************************************************
//                  Classwork 11/28/17
//  William Simunek                     11/28/17
//**************************************************
public class NumberTable
{
    public static void main(String[] args)
    {
        for(int row = 4; row <= 20; row+= 4)
        {
            for(int num = 1; num <= 4; num ++)
                System.out.print((row * num) + "\t");
                
            System.out.println();
        }
    }
}