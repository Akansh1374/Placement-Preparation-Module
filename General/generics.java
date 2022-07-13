class number<t>{
    t value;
    void show(t value){
        System.out.println(value);
    }
}

public class generics {
    public static void main(String[] args) {
        number<Integer> obj=new number<>();
        obj.show(3);

    }
}
