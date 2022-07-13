abstract class vehicle{
    abstract void go();
    
}

class bicycle extends vehicle{
    void go()
    {
        System.out.println("The vehicle is running");
    }

}

public class abstractClass {
    public static void main(String[] args) {
        //vehicle v=new vehicle();
        bicycle b=new bicycle();
     
        b.go();
    }
}
