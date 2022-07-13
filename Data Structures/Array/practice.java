import java.util.*;
public class practice{
    public static void main(String[] args) {
        int[] a={9 ,14, 10 ,10, 1, 2, 1 ,7, 10, 10, 14, 19, 9};
        Arrays.sort(a);
        int size=a.length;
        int freq=1;
        int res=-1;
        if(size==1){
            System.out.println(a[0]);
        }
        for(int i=0;i<size-1;i++){
            if(a[i]==a[i+1]){
                freq+=1;
            }
            if((freq>=size/2)&&freq!=1){
                res=a[i];
                System.out.println(freq);
                System.out.println(res);
                break;
            }
        }
    }
}