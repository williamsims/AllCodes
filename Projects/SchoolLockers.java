//**************************************************
//              Programming Project 2 MP2
//  William Simunek                     1/15/18
//**************************************************
public class SchoolLockers
{
    public static void main(String[] args)
    {
        int[] lockers = new int[100];
        for(int i = 1; i <= lockers.length; i++)
        {
            if(i%2 != 0)
            {
                for(int j = i; j < lockers.length; j++)
                    lockers[i - 1] = 1;
            }
            if(i%2 == 0)
            {
                for(int j = i; j < lockers.length; j++)
                    lockers[i - 1] = 0;
            }
        }
        for(int i = 0; i < lockers.length; i++)
        {
            if(lockers[i] == 1)
                System.out.println("Locker " + (i + 1) + " is open");
        }

    }
}