import java.util.*;
import java.math.BigInteger;

public class Practice4 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String n=sc.nextLine();
       BigInteger bi=new BigInteger(n);
       BigInteger i=new BigInteger("2");
       boolean flag=false;
       if(bi.equals(new BigInteger("1"))){
        System.out.println("not prime");
        flag=true;
        }
       else if(bi.equals(i)){
           System.out.println("prime");
           flag=true;
       }
       else{    
       for(;i.compareTo(bi)==-1;){
           if((bi.mod(i).equals(new BigInteger("0")))){
               System.out.println("not prime");
               flag=true;
               break;
            }
            i = i.add(new BigInteger("1"));
       }
       }
       if(!flag){
           System.out.println("prime");
       }
       sc.close();
    }
}
