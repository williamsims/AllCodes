//
//
import java.util.Scanner;
public class ElevatorRunner
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Elevator e1 = new Elevator(8,10);
        Elevator e2 = new Elevator(8);
        System.out.println("\nElevator 1" + e1.toString());
        System.out.println("\nElevator 2" + e2.toString());
        e1.addRiders(5);
        e1.goToFloor(7);
        e1.removeRiders(2);
        e2.addRiders(10);
        e2.goToFloor(4);
        e2.removeRiders(6);
        System.out.println("\nElevator 1" + e1.toString());
        System.out.println("\nElevator 2" + e2.toString());
        e1.goUpOneFloor();
        e1.removeRiders(1);
        e2.goToFloor(9);
        System.out.println("\nElevator 1" + e1.toString());
        System.out.println("\nElevator 2" + e2.toString());
        e1.addRiders(9);
        e1.goToFloor(3);
        e2.goToFloor(1);
        e2.addRiders(8);
        e2.goUpOneFloor();
        e2.removeRiders(2);
        e2.goToFloor(7);
        System.out.println("\nElevator 1" + e1.toString());
        System.out.println("\nElevator 2" + e2.toString());
        
    }
}