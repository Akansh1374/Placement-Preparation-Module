import java.util.*;

public class bankmain {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        bank o=new bank();
        
        System.out.println("Initial amount: "+o.balance);
        System.out.println("How much you wanna deposit ");
        int a=s.nextInt();
        o.deposit(a);

        System.out.println("How much you wanna withdraw ");
        int b=s.nextInt();
        if(b<=o.balance)
        {
        o.withdraw(a); 
        }
        else
        {
            System.out.println("Insufficient funds");
        }
    }
}
 