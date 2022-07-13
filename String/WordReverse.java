public class WordReverse{
    public static void main(String[] args) {
        String str="Hello my name is Akansh";
        String str1[]=str.split(" ");
        //for(int j=0;j<str1.length;j++)
        //{
        //    System.out.print(str1[j]+" ");
        //}
        for(int i=str1.length-1;i>=0;i--){
        System.out.print(str1[i]+" "); 
        }
    }
}