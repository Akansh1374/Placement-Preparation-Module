class anime{
    String name;
    anime(String name){
        this.name = name;
    }

}

public class ArrayofObject {
    public static void main(String[] args) {
    
    anime show1=new anime("Naruto");
    anime show2=new anime("Attack on Titan");
    anime show3=new anime("Demon Slayer");
    
    anime[] shows={show1,show2,show3};

    System.out.println(shows[0].name);
    System.out.println(shows[1].name);
    System.out.println(shows[2].name);
    }

}
