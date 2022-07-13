import java.util.Scanner;   

public class ReversedLL {

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
                tail.next=newNode;
                tail=tail.next;
            }
            data=sc.nextInt();
            }
            return head;
        }

        static Node<Integer> reverseList(Node<Integer> head) {
            Node<Integer> curr=head;
            Node<Integer> prev=null;
            Node<Integer> temp=null;
            
            while(curr!=null){
                temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            return prev;
        }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        print(head);
        System.out.println("\n");
        head=reverseList(head);
        System.out.println("Reversed LL");
        print(head);
    }
}
