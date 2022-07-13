public class recursion4 {
    static int GCD(int a,int b){
        if(a==b)
        {
            return a;
        }
        if(a%b==0)
        {
            return b;
        }
        if(b%a==0)
        {
            return a;
        }
        if(a>b)
        {
            return GCD(a%b,b);
        }
        else
        {
            return GCD(a,b%a);
        }
    }
    public static void main(String[] args) {
        System.out.println(GCD(109,105)); 
    }
    
}
