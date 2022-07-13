import java.util.Scanner;   

public class LLintro {
    
    static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    static Node<Integer> takeInput(){
        Node<Integer> head=null,tail=null;
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();

        while(data!=-1){
            Node<Integer> newNode=new Node<>(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                // Node<Integer> temp= head;
                // while(temp.next!=null){
                //     temp=temp.next;
                //     }
                //     temp.next=newNode;
                tail.next=newNode;
                tail=tail.next;
                }
                data=sc.nextInt();
                }
                return head;
            }
    public static void main(String[] args) {
        // Node<Integer> node1=new Node<>(10);
        // Node<Integer> node2=new Node<>(20);
        // Node<Integer> node3=new Node<>(30);
        // node1.next=node2;
        // node2.next=node3;

        // Node<Integer> head = node1;
        Node<Integer> head = takeInput();
        print(head);
    }
}
