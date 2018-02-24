//**************************************************
//              Classwork
//  William Simunek                     2/22/18
//**************************************************
public class StudentRunner
{
    public static void main(String[] args)
    {
        Student[] studentList = new Student[30];
        studentList[0] = new Student("Jane", "Jones");
        studentList[1] = new Student("Jim", "Moore");
        
        for(int i = 0; i < studentList.length; i++)
        {
            if(studentList[i] == null)
            {
                System.out.println("Position: " + i);
                break;
            }
        }
        Student bob = new Student("Bob", "Smith");
        Student lisa = new Student("Lisa", "Fresco");
        Student rob = new Student("Rob", "Sellers");
        
        System.out.println(bob);
        System.out.println(lisa);
        System.out.println(rob);
        
        bob = rob;
        System.out.println(bob);
        System.out.println(lisa);
        System.out.println(rob);
        
        rob.setLastName("Goose");
        System.out.println(bob);
        System.out.println(lisa);
        System.out.println(rob);
    }
}