class phones{
    String name;
    static int totalPhones;
    phones(String name)
    {
        this.name=name;
        totalPhones++;
    }
    static void add(int a,int b)
    {
        int c;
        c=a+b;
        System.out.println(c);
    }
}

public class StaticMembers{
    public static void main(String[] args) {
        
        phones p1=new phones("Apple");
        phones p2=new phones("Samsung");
        phones p3=new phones("Vivo");

        System.out.println(phones.totalPhones);

        phones.add(3,4);
    }
}
