class zoo{
    int cages=50;
    int ponds=20;
    int trees=100;
}

class cheetah extends zoo{

}

class panda extends zoo{

}

public class inheritance{
    public static void main(String[] args) {
        
        cheetah c=new cheetah();
        panda p=new panda();

        System.out.println(c.cages);
        System.out.println(p.ponds);
    }
    
}
