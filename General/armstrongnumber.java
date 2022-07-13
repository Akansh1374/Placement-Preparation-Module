import java.util.*;
import java.lang.Math;

public class armstrongnumber{
    public static void main(String args[]) {
    double n=0;
    double b=0,c=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number ");
    int a=sc.nextInt();
    int aCopy=a;
    double temp=a;
    int count =0;
    while(aCopy>0){
        count+=1;
        aCopy/=10;
    }
    while(a>0){
        n=a%10;
        b=Math.pow(n,count);
        c=b+c;
        a=a/10;
    }
    
    if(temp == c){
        System.out.println("It is an armstrong number");
    }
    else{
        System.out.println("It is not an armstrong number");
    }
    sc.close();
    }
   
}
