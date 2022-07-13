import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> anime=new ArrayList<>();

        anime.add("Naruto");
        anime.add("Attack on Titan");
        anime.add("Demon Slayer");
        anime.add("Shokugeki no Soma");
        System.out.println(anime);

        anime.add(3,"Steins;Gate");
        System.out.println(anime);

        anime.remove(3);
        System.out.println(anime);

        //set Updates the value of the index
        anime.set(3,"Rising of the Shield Hero");
        System.out.println(anime);

        //It takes out the element from that index
        String a=anime.get(3);
        System.out.println(a);

        //size
        System.out.println(anime.size());

        //loop
        for(int i=0;i<anime.size();i++)
        {
            System.out.println(anime.get(i));
        }

    }    
}
