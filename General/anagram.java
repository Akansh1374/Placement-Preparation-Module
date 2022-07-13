import java.util.*;

public class anagram{
    public static void main(String args[]){
        int flag=0;
        Scanner sc=new Scanner(System.in);

        String a=sc.nextLine();
        String b=sc.nextLine();

        if(a.length()!=b.length()){
            System.out.println("It is not an anagram");
            System.exit(0);
        }

        char c[]=a.toCharArray();
        char d[]=b.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);

        for(int i=0;i<c.length;i++){
            if(c[i]==d[i])
            {
                flag=1;
            }
            else{
                System.out.println("It is not an anagram");
                break;
            }

        }
        if(flag==1)
            System.out.println("It is an anagram");

        sc.close();
    }
}