public class StringSorting {
    public static void main(String[] args) {
        
        String[] arr={"naruto","sasuke","sakura","kakashi","obito","madara","hashirama"};
        int n=arr.length;
        
        String temp;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j+1].compareTo(arr[j])<0)
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }   
}
