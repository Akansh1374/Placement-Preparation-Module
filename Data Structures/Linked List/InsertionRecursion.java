import java.util.*;

public class InsertionRecursion {

    static void print(Node<Integer> head){
        Node<Integer> tail=head;
        while(tail!=null){
            System.out.print(tail.data+" ");
            tail=tail.next;
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

    static Node<Integer> insert(Node<Integer> head,int position,int data){
        if(position==0){
            Node<Integer> newNode=new Node<>(data);
            newNode.next=head;
            return newNode;
        }
        else{
            Node<Integer> smallerHead=insert(head.next, position-1, data);
            head.next=smallerHead;
            return head;
        }
    }

    public static void main(String[] args) {

        Node<Integer> head = takeInput();
        head=insert(head,2,69);
        print(head);
        
    }
}
