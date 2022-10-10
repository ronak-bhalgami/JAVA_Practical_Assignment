import java.util.*;

class checking extends Account 
{
    
}

class Saving extends Account 
{
    static int dr = 5000;
    double balance;

    void draft() 
    {
        System.out.println("Enter the Amount you want to Withdraw : ");
        double with = sc.nextDouble();
        if (with > balance) 
        {
            System.out.println("Account have insufficient balance!!");
        } 
        else 
        {
            if (with <= dr) 
            {
                balance = balance - with;
                System.out.println("The updated balnce is : " + balance);
            } 
            else 
            {
                System.out.println("Over Draft Limit !!");
            }
        }
    }
}

public class PR5
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Account a = new Account();
        Saving s = new Saving();
        System.out.println("1.Widthdraw");
        System.out.println("2.Deposit");

        for (int i = 1; i >= 1; i++) 
        {
            System.out.println("Enter Your Input : ");
            int k = sc.nextInt();
            switch (k) 
            {
                case 1:
                    a.withdraw();
                    s.draft();
                    continue;
                case 2:
                    a.deposit();
                    continue;
                default:
                    System.out.println("Error");
            }
        }
    }
}
