//**************************************************
//              Programming Project 1 MP2
//  William Simunek                     12/14/17
//**************************************************
import java.util.Scanner;
public class Phone
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a phone number(Do not include the dashes):");
        String phone = scan.nextLine().toLowerCase();
        phone = phone.replace('a','2');
        phone = phone.replace('b','2');
        phone = phone.replace('c','2');
        phone = phone.replace('d','3');
        phone = phone.replace('e','3');
        phone = phone.replace('f','3');
        phone = phone.replace('g','4');
        phone = phone.replace('h','4');
        phone = phone.replace('i','4');
        phone = phone.replace('j','5');
        phone = phone.replace('k','5');
        phone = phone.replace('l','5');
        phone = phone.replace('m','6');
        phone = phone.replace('n','6');
        phone = phone.replace('o','6');
        phone = phone.replace('p','7');
        phone = phone.replace('q','7');
        phone = phone.replace('r','7');
        phone = phone.replace('s','7');
        phone = phone.replace('t','8'); 
        phone = phone.replace('u','8');
        phone = phone.replace('v','8');
        phone = phone.replace('w','9');
        phone = phone.replace('x','9');
        phone = phone.replace('y','9');
        phone = phone.replace('z','9');
        if(phone.length() == 11)
        {
            System.out.println("Numerical Phone Number: " + phone.charAt(0) + "-" + phone.charAt(1) + phone.charAt(2) + phone.charAt(3) + "-" + phone.charAt(4)  
                               + phone.charAt(5) + phone.charAt(6) + "-" + phone.charAt(7) + phone.charAt(8) + phone.charAt(9) + phone.charAt(10));
        }
        else if(phone.length() == 10)
        {

            System.out.println("Numerical Phone Number: " + phone.charAt(0) + phone.charAt(1) + phone.charAt(2) + "-" + phone.charAt(3) + phone.charAt(4) 
                               + phone.charAt(5)+ "-" + phone.charAt(6) + phone.charAt(7) + phone.charAt(8) + phone.charAt(9));
        }
        else
          System.out.println("Invalid Phone Number");
    }
}   
