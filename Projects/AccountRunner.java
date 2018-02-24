//*********************************
//MP2 Programming Project 3
//William Simunek   1/30/18
//*********************************
public class AccountRunner
{
    public static void main(String[] args)
    {
        Account a1 = new Account();
        System.out.println(a1.toString());
        Account a2 = new Account(900704,1234.91);
        Account a3 = new Account(24801271, 4839.56);
        Account a4 = new Account();
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println(a4.toString());
        a1.setId(369798);
        a1.setBalance(6543.21);
        a4.setId(15183039);
        a4.setBalance(7392.55);
        a1.setAnnualInterestRate(0.025);
        a2.setAnnualInterestRate(0.05);
        a3.setAnnualInterestRate(0.046);
        a4.setAnnualInterestRate(0.066);
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println(a4.toString());
        a1.withdrawl(1000.10);
        a2.deposit(1000.10);
        a4.withdrawl(45.76);
        a3.deposit(45.76);
        a2.withdrawl(938.62);
        a1.deposit(938.62);
        a3.withdrawl(5.50);
        a4.deposit(5.50);
        System.out.println(a1.getAnnualInterestRate());
        System.out.println(a1.getMonthlyInterestRate());
        System.out.println(a1.getId());
        System.out.println(a1.getBalance());
        System.out.println(a2.getAnnualInterestRate());
        System.out.println(a2.getMonthlyInterestRate());
        System.out.println(a2.getId());
        System.out.println(a2.getBalance());
        System.out.println(a3.getAnnualInterestRate());
        System.out.println(a3.getMonthlyInterestRate());
        System.out.println(a3.getId());
        System.out.println(a3.getBalance());
        System.out.println(a4.getAnnualInterestRate());
        System.out.println(a4.getMonthlyInterestRate());
        System.out.println(a4.getId());
        System.out.println(a4.getBalance());
    }
}