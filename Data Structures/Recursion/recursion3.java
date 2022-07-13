//Factorial of a number
import java.util.*;

public class recursion3 {
    static int factorial(int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }
        else{
            int a=factorial(n-1);
            int fact=n*a; 
            return fact;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value");
        int n;
        n=s.nextInt();
        int ans=factorial(n);
        System.out.println(ans);
        s.close();
    }
}
