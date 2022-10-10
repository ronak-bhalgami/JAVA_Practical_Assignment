import java.util.*;

public class PR3 {
    public static void main(String[] args) 
    {         
        Scanner sc = new Scanner(System.in);         
        int a; 
        ArrayList<Account> Ac = new ArrayList<Account>();         
        for(int i=0;i<10;i++){ 
            Account account = new Account(); 
            Ac.add(account); 
        } 
        for(int i=0;i<10;i++){ 
            Ac.get(i).setId(i); 
        } 
        if(Ac.isEmpty()) 
            System.out.println("Arraylist is empty,.");         
            do{ 
            System.out.print("\nEnter the id: ");             
            a = sc.nextInt(); 
            for(int i=0;i<Ac.size();i++){ 

	                if(Ac.get(i).getId()==a){ 
                    int c = 0;                     
                    do{ 
                        System.out.print("Enter 1 for Balance Inquiry\n2 for Withdraw money\n3 for Deposit money\n4 for exit\nEnter the number: "); 
                        c = sc.nextInt();                         
                        switch(c) 
                        {                             
                            case 1: 
                                System.out.println("Current Balance is " + Ac.get(i).getBalance()); 
                                break;                             
                                case 2: 
                                System.out.print("Enter the amount of money you want to withdraw "); 
                                double withbal = sc.nextDouble(); 
                                System.out.println("After withdrawal the balance is " + Ac.get(i).withdraw(withbal)); 
                                break;                             
                                case 3: 
                                System.out.print("Enter the amount of money you want to deposit ");                                 double depbal = sc.nextDouble(); 
                                System.out.println("After deposit the balance is " + Ac.get(i).deposit(depbal)); 
                                break; 
                        } 
                    }while(c!=4); 
                } 
            } 
        }while(a!=99); 
    }
}
