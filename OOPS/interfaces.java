interface predator{
    void hunting();
}

interface prey{
    void caught();
}

class fish implements predator,prey{
    @Override
    public void hunting()
    {
        System.out.println("The Fish is hunting");
    }
    public void caught()
    {
        System.out.println("The fish got caught");
    }
}

public class interfaces {
    public static void main(String[] args) {
        fish f=new fish();

        f.hunting();
        f.caught();
    }
    
}
