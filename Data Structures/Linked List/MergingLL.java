import java.util.*;

public class MergingLL {

    static void print(Node<Integer> head){
        Node<Integer> tail=head;
        while(tail!=null){
            System.out.print(tail.data+" ");
            tail=tail.next;
        }
    }
    public static void main(String[] args) {
        
        Node<Integer> node1=new Node<Integer>(1);
        Node<Integer> node2=new Node<Integer>(2);
        Node<Integer> node3=new Node<Integer>(3);
    
        Node<Integer> head1=node1;
        head1.next=node2;
        node2.next=node3;
        node3.next=null;
        
        Node<Integer> node4=new Node<Integer>(4);
        Node<Integer> node5=new Node<Integer>(5);
        Node<Integer> node6=new Node<Integer>(6);
    
        Node<Integer> head2=node4;
        head2.next=node5;
        node5.next=node6;
        node6.next=null;

        print(head1);
        System.out.println("");
        print(head2);
        System.out.println("");
        node3.next=node4;
        print(head1);
    }
    
}
