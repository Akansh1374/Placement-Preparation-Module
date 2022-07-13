import java.util.*;
public class arraylistdepth {
    public static void main(String[] args){
        ArrayList<ArrayList<String>> companies = new ArrayList();
  
        ArrayList<String> samsung=new ArrayList<String>();
        samsung.add("S21 Ultra");
        samsung.add("M50");
        samsung.add("A90");
        ArrayList<String> apple=new ArrayList<String>();
        apple.add("Iphone 12");
        apple.add("Iphone 12");
        apple.add("Iphone X");
        
        companies.add(samsung);
        companies.add(apple);

        System.out.println(companies); 
    }
    
}
