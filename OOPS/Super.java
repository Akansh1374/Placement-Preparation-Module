class anime{
    int Naruto=720;
}
public class Super extends anime{
    int Naruto=400;
    public static void main(String[] args) {
        new Super().display();
        new Super().display2();
    }
    void display(){
        System.out.println(this.Naruto);
    }
    void display2(){
        System.out.println(super.Naruto);
    }
}
