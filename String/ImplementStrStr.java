public class ImplementStrStr {
    public static void main(String[] args) {
        String str="hello";
        String str1="ll";

        int len1=str1.length();
        int len2=str.length();

        int i=0;
        while((i+len1)!=len2){
            if(str.subSequence(i, i+len1).equals(str1)){
                break;
            }
            else
            i++;
        }
        System.out.println(i);
    }
}
