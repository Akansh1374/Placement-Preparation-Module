import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        
        Stack<String> games = new Stack<String>();

        games.push("Minecraft");
        games.push("Prince of Persia");
        games.push("GTA V");
        games.push("Tomb Raider");

        String a=games.pop();

        //System.out.println(games.empty());
        System.out.println(a);
        System.out.println(games.peek());
        System.out.println(games);

        System.out.println(games.search("Minecraft"));
    }
}
