import java.net.SocketTimeoutException;
import java.util.*;

import javax.security.auth.PrivateCredentialPermission;

class Account {
    Scanner sc = new Scanner(System.in);
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    double Minterest_rate = 0;
    double MInterest = 0;

    double new_balance1;
    double new_balance2;

    Account() {
        int b = (int) (Math.random() * (1000 - 100 + 1) + 100);
        System.out.println("Your account ID number is : " + b);
        System.out.println("Your account balance is " + balance);
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        System.out.println("Your account ID number is : " + id);
        System.out.println("Your account balance is " + balance);
    }

    public void getdata() {
        System.out.println("Enter id of your account : ");
        id = sc.nextInt();
        System.out.println("Enter balance of your account : ");
        balance = sc.nextDouble();
        System.out.println("Enter annualInterestRate : ");
        annualInterestRate = sc.nextDouble();
    }

    public void display() {
        System.out.println("ID number of account : " + id);
        System.out.println("Balance of your account : " + balance);
        System.out.println("AnnualInterestRate : " + annualInterestRate);
    }

    public double getMonthlyInterestRate() {
        Minterest_rate = annualInterestRate / 12;
        return Minterest_rate;
    }

    public double getMonthlyInterest() {
        MInterest = (balance * Minterest_rate) / 100;
        return MInterest;
    }

    public void withdraw() {
        System.out.println("How much amount you want to withdraw : ");
        double w = sc.nextDouble();
        new_balance1 = balance - w;
        System.out.println("New balnce of account after withdraw : " + new_balance1);
    }

    public void deposit() {
        System.out.println("How much amount you want to deposit : ");
        double d = sc.nextDouble();
        new_balance2 = balance + d;
        System.out.println("New balance of account after deposit : " + new_balance2);
    }
}

public class PR1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a = new Account();

        a.getdata();
        a.display();
        System.out.println("1.GetMonthlyInterestRate");
        System.out.println("2.Widthdraw");
        System.out.println("3.Deposit");

        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Monthly Interest rate : " + a.getMonthlyInterestRate());
                System.out.println("Monthly Interest : " + a.getMonthlyInterest());
                break;

            case 2:
                a.withdraw();
                break;

            case 3:
                a.deposit();
                break;

            default:
                System.out.println("Error");
        }
    }
}
