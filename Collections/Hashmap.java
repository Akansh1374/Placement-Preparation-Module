import java.util.HashMap;
import java.util.Map;

public class Hashmap{
    public static void main(String[] args) {
        Map<String,String> name = new HashMap<>();
        name.put("Main Character", "Eren");
        name.put("Female Lead", "Mikasa");
        name.put("Good Friend", "Armin");
        name.put("OP", "Levi");
        name.put("Hairy Ass", "Zeke");

        name.remove("Hairy Ass");
        System.out.println(name.get("Main Character")); 
        //System.out.println(name);

        // for(Map.Entry<String, String> e:name.entrySet()){
        //     //System.out.println(e.getKey());
        //     //System.out.println(e.getValue());
        //     System.out.println(e);
        // }

        // for(String Value:name.values()){
        //     System.out.println(Value);
        // }
    }
    
}
