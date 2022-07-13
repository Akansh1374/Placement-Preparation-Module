import java.util.*;
public class arraylist2{
    public static void main(String[] args){
    ArrayList<String> anime= new ArrayList<String>();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements");
    int b= sc.nextInt();
    System.out.println("Enter the elements");
    for(int j=0;j<=b;j++){
        String a= sc.nextLine();
        anime.add(a);
    }
    System.out.println("Enter the element to be removed");
    String c=sc.nextLine();
    anime.remove(c);
    /*anime.add("Naruto");
    anime.add("Attack On Titan");
    anime.add("Noragami");
    anime.add("Steins;Gate"); */
    
    for(int i=0;i<anime.size();i++){
        System.out.println(anime.get(i));
    }
    sc.close();    
    }
}