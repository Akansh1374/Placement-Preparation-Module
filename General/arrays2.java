public class arrays2{
    public static void main(String args[]) {
        int sum = 0;
        int[] a;
        a = new int[]{1 ,2, 3 ,3 ,1};
        // int b[] = new int[5];
        // int a[5] = new int[5]; // wrong
        // int c[] = {1 , 2, 3};
        // int[] d = new int[]{1 ,2 ,3};
        // int[] e = new int[5]{1 , 3, 5 ,7 ,9}; //wrong
        // for-each loop
        for (int i : a) {
            sum = sum + a[i-1];
            System.out.println("i " + i);
            System.out.println("a[i] " + a[a[a[i-1]]-1]); 
        }
        System.out.println(sum);
    }
}