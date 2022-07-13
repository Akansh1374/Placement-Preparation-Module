import java.util.*;

public class MatrixAddition {
    public static void main(String args[]) 
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of rows: ");   
     int row=sc.nextInt();
    
     System.out.println("Enter the number of columns: ");   
     int column=sc.nextInt();

     int[][] a=new int[row][column];
     int[][] b=new int[row][column];
     
     for(int i=0;i<row;i++)
     {
         for(int j=0;j<column;j++)
         {
            a[i][j]=sc.nextInt();
         }
     }
     for(int i=0;i<row;i++)
     {
         for(int j=0;j<column;j++)
         {
            b[i][j]=sc.nextInt();
         }
     }
     for(int i=0;i<row;i++)
     {
         for(int j=0;j<column;j++)
         {
             System.out.print(a[i][j]+" ");
         }
         System.out.println();
     }
     for(int i=0;i<row;i++)
     {
         for(int j=0;j<column;j++)
         {
             System.out.print((b[i][j]+a[i][j])+" ");
         }
         System.out.println();
     }
     sc.close();
    
    }
}

    

