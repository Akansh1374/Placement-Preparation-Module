import java.util.Scanner;   

public class NodeInsertion {
    
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

        static Node<Integer> insert(Node<Integer> head,int position,int data){
            Node<Integer> NewNode=new Node<>(data);
            if(position==0){
                NewNode.next=head;
                head=NewNode;
                return head;
            }
            int i=0;
            Node<Integer> temp=head;
            while(i < position-1){
                temp=temp.next;
                i++;
            }
            NewNode.next=temp.next;
            temp.next=NewNode;
            return head;
        }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        print(head);
        System.out.println("\nUpdated LL");
        head=insert(head,0,69);
        print(head);
    }
}
