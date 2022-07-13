import java.math.BigInteger;
import java.util.*;

public class CrackTheSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger res=new BigInteger("2");
        if(n%2==0)
        {
            int i=2;
            int temp=1;
            while(i<n){
                temp=temp*3;
                i=i+2;
            }
                res=res.pow(temp);
                System.out.println(res);
        }
        if(n%2!=0){
            {
                int i=1;
                int temp=1;
                while(i<n){
                    temp=temp*2;
                    i=i+2;
                }
                    res=res.pow(temp);
                    System.out.println(res);
            }
        }
    }
}
