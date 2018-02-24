//*****************************************
//William Simunek 
//Classwork 2/20/18
//*****************************************
public class Circles
{
    private double radius;
    private static int numOfObjects;
    
    public Circles(double r, int n)
    {
        radius = r;
        numOfObjects = n;
    }
    public int getNumOfObjects()
    {
        return numOfObjects;
    }
    public void setNumOfObjects(int n)
    {
        numOfObjects = n;
    }
    public double getTotalArea()
    {
        return (Math.PI * radius * radius * numOfObjects);
    }
    public String toString()
    {
        return "Radius:\t\t\t" + radius + "\nNumber of Objects:\t" + numOfObjects
                + "\nTotal Area:\t\t" + getTotalArea();
    }
}
