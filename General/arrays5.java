import java.util.*;

public class arrays5{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        System.out.println("Enter the number of elements");
        int a=sc.nextInt();
        int[] arr=new int[a];
        System.out.println("Enter the elements");
        
        for(int i=0;i<arr.length;i++){
            int b=sc.nextInt();
            arr[i]=b;
        }
        System.out.println("Enter the element to search");
        int c=sc.nextInt();
        int temp=c;
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]==temp)
            {
                
                flag=1;
                break;
                
            }
            else{
                flag=0;
            }
    }
    
    if(flag==1){
        System.out.println("Element exists");
        System.out.println("Position is "+(i+1));
    }
    if(flag==0){
        System.out.println("Element is not found");

        }


    
    sc.close();
        



    }
    

    
}
