import java.util.*;

public class HCF {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a=sc.nextInt();
        System.out.println("Enter the second number ");
        int b=sc.nextInt();
        System.out.println("Enter the third number ");
        int c=sc.nextInt();
        for(int i=c;;i--){
            if((a%i==0)&&(b%i==0)&&(c%i==0)){
                System.out.println("HCF is : "+i);
                break;
            }
        }
        sc.close();
    }  
}
