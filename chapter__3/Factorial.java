//*******************************************
//  				Classwork
//  William Simunek				10/24/17
//********************************************
import java.util.Scanner;
public class Factorial 
{
  public static void main(String[] args) 
  {
    
    Scanner scan = new Scanner(System.in);
    int num, factorial, originalNum;
    System.out.println("Enter a non negative integer:");
    num = scan.nextInt();

    
    while (num < 0)
    {
      System.out.println("Number is negative, please enter another number");
      num = scan.nextInt();
    }
    
    System.out.print(num);
    factorial = num;
    originalNum = num;
                         
    while (num > 1)
    {
      num --;
      System.out.print(" * "  + num);
      factorial *= num;
    }
    System.out.println("\nThe factorial of " + originalNum + " is " + factorial);
  }
}
