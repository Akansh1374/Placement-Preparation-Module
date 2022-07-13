import java.util.*;
public class symmetricarray {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter the number of rows: ");
        int row=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols=sc.nextInt();
        
        int[][] A = new int[row][cols];
        int[][] newA = new int[row][cols];
        int[][] B = new int[row][cols];
        int[][] newB = new int[row][cols];
        int[][] C = new int[row][cols];
        int[][] D = new int[row][cols];
        int[][] temp = new int[row][cols];
        System.out.println("Enter the elements in array: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
               A[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                newA[i][j]=A[j][i];
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
               B[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                newB[i][j]=B[j][i];
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                C[i][j]=A[i][j]+newA[i][j];
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                D[i][j]=B[i][j]+newB[i][j];
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                //temp[i][j]=(1/2)C[i][j]+(1/2)D[i][j];
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                
            }
            System.out.println();
        }
        sc.close();
    }
}
