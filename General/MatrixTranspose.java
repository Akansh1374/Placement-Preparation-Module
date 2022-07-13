import java.util.*;
public class MatrixTranspose {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
    /*
    1 2 3  00 01 02
    4 5 6  10 11 12
    7 8 9  20 21 22
    ---------------
    1 4 7  00 01 02
    2 5 8  10 11 12
    3 6 9  20 21 22
    ij => ji
    a[i][j]
    a[j][i]
     */ 
        System.out.println("Enter the number of rows: ");
        int row=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols=sc.nextInt();
        
        int[][] arr = new int[row][cols];
        int[][] transpose = new int[row][cols];
        System.out.println("Enter the elements in array: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The transpose is: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                transpose[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
