//**************************************
//Classwork
//William Simunek   1/18/18
//**************************************
public class CircleRunner
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(7);
        System.out.println(c1.getArea());
        c1.setRadius(5.47);
        System.out.println(c1.toString());
        Circle c2 = new Circle();
        System.out.println(c2.toString());
        c2.setRadius(12);
        if(c1.getRadius() > c2.getRadius())
            System.out.println("Circle 1 has a larger radius");
        else if(c1.getRadius() < c2.getRadius())
            System.out.println("Circle 2 has a larger radius");
        else    
            System.out.println("Circle 1 has the same radius as Circle 2");
        System.out.println(c2);
    }
}