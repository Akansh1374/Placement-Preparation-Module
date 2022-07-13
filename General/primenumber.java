import java.util.*;

public class primenumber{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        int flag=0;
        if(n==2)
            System.out.println("Number is prime");
        else if(n>2){
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                flag=0;
                break;
            }
            else
                flag=1;
        }
        if(flag==0)
            System.out.println("Number is not a prime number");
        else
            System.out.println("Number is a prime number");
        }
        else
            System.out.println("Number is not prime.");
        sc.close();
    }
}
