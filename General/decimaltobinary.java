import java.util.*;

public class decimaltobinary{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        String binNum="";
        int nCopy=n,rem=0;
        while(nCopy>0){
            rem=nCopy%2;
            binNum=binNum+Integer.toString(rem);
            nCopy/=2;
        }
        StringBuffer res = new StringBuffer(binNum);
        res = res.reverse();
        System.out.println(res);
        sc.close();
    }
        
    }
