import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args){
        ArrayList<String> shows=new ArrayList<String>();
        shows.add("Friends");
        shows.add("Game of thrones");
        shows.add("Dark");
        shows.add("Stranger Things");

        shows.set(0,"Queen's Gambit");
        shows.remove(4);
        
        
        for(int i=0;i<=shows.size();i++) {
            System.out.println(shows.get(i));
            
        }   
    }
    
}