import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b;
        double c=0;
        String op;
        System.out.println("Enter the first no.");
        a=s.nextInt();
        System.out.println("choose the operator:");
        op=s.next();
        System.out.println("enter the second no.");
        b=s.nextInt();
        s.close();
        switch(op){
            case "+":c=a+b;
            break;
            case "-":c=a-b;
            break;
            case "*":c=a*b;
            break;
            case "/":c=a/b;
            break;
            case "%":c=a%b;
            break;
            default:System.out.println("Wrong operation kiddo");
        }
        System.out.println("Answer is:  "+c);
        
    }
    
}
