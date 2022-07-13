class anime {
    String name="Demon Slayer";
    String source="Manga";
    String Genre="Action,Shounen";

    @Override
    public String toString() {
        return name+"\n"+source+"\n"+Genre;
    }
}

public class toString {
    public static void main(String[] args) {
        anime a1=new anime();

        System.out.println(a1);
    }
    
}
