//To print numbers in decreasing order

public class recursion {
    
    static void decrease(int n)
    {
        if(n==0)
        {
            return;
        }
        else{
            System.out.println(n);
            decrease(n-1);
        }
    }
    public static void main(String[] args) {
        int n=5;
        decrease(n);
    }
}
