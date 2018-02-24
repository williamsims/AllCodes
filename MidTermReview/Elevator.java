//
//
public class Elevator
{
    private final int TOPFLOOR;
    private int currentFloor;
    private int capacity;
    private int numRiders;
    
    public Elevator(int t, int c)
    {
        TOPFLOOR = t;
        capacity = c;
        numRiders = 0;
        currentFloor = 1;
    }
    public Elevator(int t)
    {
        TOPFLOOR = t;
        capacity = 12;
        numRiders = 0;
        currentFloor = 1;
    }
    public int getNumRiders()
    {
        return numRiders;
    }
    public int getCurrentFloor()
    {
        return currentFloor;
    }
    public boolean isFull()
    {
        if(numRiders > capacity)
            return true;
        else
            return false;
    }
    public void addRiders(int numEntering)
    {
        numRiders += numEntering;
    }
    public void removeRiders(int numLeaving)
    {
        numRiders -= numLeaving;
    }
    public void goUpOneFloor()
    {
        if(currentFloor == TOPFLOOR)
            currentFloor = TOPFLOOR;
        else
            currentFloor ++;
    }
    public void goDownOneFloor()
    {
        if(currentFloor == 1)
            currentFloor = 1;
        else
            currentFloor--;
    }
    public void goToFloor(int floor)
    {
        if(floor >= 1 && floor <= 200)
            currentFloor = floor;
    }
    public String toString()
    {
        return "\nCurrent Floor: " + currentFloor 
                + "\nTop Floor: " + TOPFLOOR
                + "\n Number of Riders: " + numRiders
                + "\n Capacity: " + capacity;
    }
    public boolean sameFloor(Elevator e)
    {
        if (currentFloor == e.getCurrentFloor())
            return true;
        else
            return false;
    }
}