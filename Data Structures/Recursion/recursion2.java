//Sum of numbers
public class recursion2{
    static void sumOfNumbers(int i,int n,int sum)
    {
        if(i==n)
        {
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        else{
            sum=sum+i;
            sumOfNumbers(i+1, n, sum);
        }
    }
    public static void main(String[] args) {
        sumOfNumbers(1,5,0);
    }
}
