class mug{
    void fill()
    {
        System.out.println("You fill the mug");
    }
    void hold()
    {
        System.out.println("You hold the mug");
    }
}

class coffee extends mug{
    public char[] colour;
    void fill()
    {
        System.out.println("You fill the mug with coffee");
    }
    void hold()
    {
        System.out.println("You hold the mug");
    }
}
public class methodOverriding {
    public static void main(String[] args) {

        coffee c=new coffee();
        mug m=new mug();
        m.fill();
        c.fill();
        
    }
    
}
