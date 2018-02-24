//*********************************
//MP2 Programming Project 3
//William Simunek   1/30/18
//*********************************
public class Account
{
    private int id;
    private double balance;
    private double annualInterestRate;
    
    public Account()
    {
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
    }
    public Account(int i, double b)
    {
        id = i;
        balance = b;
        annualInterestRate = 0.0;
    }
    public void setAnnualInterestRate(double a) 
    {
        annualInterestRate = a;
    }
    public void setId(int i)
    {
        id = i;
    }
    public int getId() 
    {
        return id;
    }
    public void setBalance(double b)
    {
        balance = b;
    }
    public double getBalance() 
    {
        return balance;
    }
    public double getAnnualInterestRate() 
    {
        return annualInterestRate;
    }
    public double getMonthlyInterestRate()
    {
        return (annualInterestRate / 12);
    }
    public void withdrawl(double w)
    {
        balance -= w;
    }
    public void deposit(double d)
    {
        balance += d;
    }
    public String toString()
    {
        return "Account ID: " + id + "\nAccount Balance: " + balance + "\nMonthly Interest: "
                + (balance * (annualInterestRate / 12) + "\n");
    }
}
