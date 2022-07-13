public class Count {
    public static void main(String[] args) {
        String s="Hello my name is akansh";
        int totalLength=s.length();
        s=s.replaceAll("n", "");
        int withoutChar=s.length();

        int count=totalLength-withoutChar;
        System.out.println("Occurence of this character is: "+count);

    }
    
}
