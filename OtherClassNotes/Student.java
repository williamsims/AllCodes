//**************************************************
//              Classwork
//  William Simunek                     2/22/18
//**************************************************
public class Student
{
    private String firstName;
    private String lastName;
    
    public Student(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public boolean sameLastName(Student other)
    {
        if(this.getFirstName().equalsIgnoreCase(other.getLastName()))
        {
            return true;
        }
        return false;
    }
    public String toString()
    {
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\n";
    }
}