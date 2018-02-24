//
//
public class SkyscraperElevator
{
    public static void main(String[] args)
    {
        Elevator[] elevatorSet = new Elevator[6];
        for(int i = 0; i < 3; i++)
            elevatorSet[i] = new Elevator(30,10);
        for (int i = 3; i < elevatorSet.length; i++)
            elevatorSet[i] = new Elevator(30);
        for (int i = 0; i < elevatorSet.length; i++)
        {
            if(((i + 1) % 2) == 0)
                elevatorSet[i].addRiders(8);
            else
                elevatorSet[i].addRiders(5);
        }
        elevatorSet[0].goToFloor(7);
        elevatorSet[1].goToFloor(2);
        elevatorSet[2].goToFloor(5);
        elevatorSet[3].goToFloor(15);
        elevatorSet[4].goToFloor(15);
        elevatorSet[5].goToFloor(23);
        for (int i = 0; i < elevatorSet.length; i++)
        {
            if(((i + 1) % 2) == 0)
                elevatorSet[i].removeRiders(4);
            else
                elevatorSet[i].removeRiders(3);
        }
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 8; j++)
                elevatorSet[i].goUpOneFloor();
        }
        for (int i = 3; i < elevatorSet.length; i++)
        {
            for(int j = 0; j < 2; j++)
                elevatorSet[i].goUpOneFloor();
        }
        for (int i = 0; i < elevatorSet.length; i++)
        {
            if(((i + 1) % 2) == 0)
            {
                elevatorSet[i].removeRiders(0);
                elevatorSet[i].addRiders(12);
            }
            else
            {
                elevatorSet[i].removeRiders(3);
                elevatorSet[i].addRiders(7);
            }
        }
        for(int i = 0; i < 3; i++)
            elevatorSet[i].goDownOneFloor();
        for (int i = 3; i < elevatorSet.length; i++)
        {
            for(int j = 0; j < 3; j++)
            elevatorSet[i].goDownOneFloor();
        }
        for(int i = 0; i < elevatorSet.length; i++)
        {
            System.out.println("Elevator " + (i + 1) + elevatorSet[i] + "\n");
        }

    }
}