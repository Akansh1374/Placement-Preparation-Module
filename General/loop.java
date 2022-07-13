import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        int i,j,rows,columns;
        String a;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        rows= scanner.nextInt();
        System.out.println("Enter the no. of columns");
        columns=scanner.nextInt();
        System.out.println("Enter the symbol");
        a=scanner.next();
        for(i=0;i<=rows;i++){
            System.out.println("");
            for(j=0;j<=columns;j++){
                System.out.print(""+a);
            }
        }
    }
}
