class anime{
    private String a="Attack on Titan";
    private String b="Demon Slayer";
    private String c="Devil is a part timer";

    public String a()
    {
        return a;
    }
    public String b()
    {
        return b;
    }
    public String c()
    {
        return c;
    }
    public void  seta(String a)
    {
        this.a=a;
    }
    public void  setb(String b)
    {
        this.b=b;
    }
    public void setc(String c)
    {
        this.c=c;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        anime an=new anime();

        System.out.println(an.a());


    }
}
