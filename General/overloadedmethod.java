import java.util.Scanner;
public class overloadedmethod {
    public static void main(String[] args){
        double a,b,c,d;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        d=sc.nextDouble();
        sc.close();
        double x=add(a,b,c,d);
        System.out.println(x);
    }
    static int add(int a,int b){
        System.out.println("Overloaded method #1  ");
        return a+b;
    }
    static int add(int a,int b,int c){
        System.out.println("Overloaded method #2  ");
        return a+b+c;
    }
    static int add(int a,int b,int c,int d){
    System.out.println("Overloaded method #3  ");
    return a+b+c+d;
    }
    static double add(double a,double b){
        System.out.println("Overloaded method #4  ");
        return a+b;
    }
    static double add(double a,double b,double c){
        System.out.println("Overloaded method #5  ");
        return a+b+c;
    }
    static double add(double a,double b,double c,double d){
    System.out.println("Overloaded method #6  ");
        return a+b+c+d;
    }
}

