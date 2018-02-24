//*******************************************
//  				Classwork
//  William Simunek				11/1/17
//********************************************
import java.util.Scanner;
public class DisplayNumberes 
{
  public static void main(String[] args) 
  {
      Scanner scan = new Scanner(System.in);
      int num = 100, count = 0;
      while (num <= 1000)
        {
            if (num / 5 == 0 && num / 6 ==0)
            {
                System.out.println(num + " ");
                count ++;
            }
            if (count / 10 == 0)
            {
                System.out.println();
            }
            num ++;
        }
  }
}
  