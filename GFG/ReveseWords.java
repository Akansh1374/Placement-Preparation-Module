public class ReveseWords {
    public static void main(String[] args) {
        String str="Hello.my.name.is.Akansh";
        String[] res=str.split("\\.");
        String ans="";

        for (int i = res.length-1; i >= 0; i--) {
            ans+=res[i];
            if(i==0){
                continue;
            }
            ans+=".";
        }
        System.out.println(ans);
    }
    
}
