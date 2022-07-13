public class MergeTwoSortedLL {

    static void print(Node<Integer> head){
        Node<Integer> tail=head;
        while(tail!=null){
            System.out.print(tail.data+" ");
            tail=tail.next;
        }
    }

    static Node<Integer> merge(Node<Integer> head1 , Node<Integer> head2){
        Node<Integer> head = null , tail = null;
        Node<Integer> tail1 = head1 , tail2 = head2;

            if(head1==null){
                return head2;
            }
            if(head2==null){
                return head1;
            }

            if(tail1.data >= tail2.data){
                head = tail2;
                tail = tail2;
                tail2 = tail2.next;
            }
            else{
                head = tail1;
                tail = tail1;
                tail1 = tail1.next;
            }
            while(tail1!=null && tail2!=null){
                if(tail1.data > tail2.data){
                    tail.next = tail2;
                    tail2 = tail2.next;
                    tail = tail.next;
                }
                else{
                    tail.next = tail1;
                    tail1 = tail1.next;
                    tail = tail.next;
                }

                if(tail1!=null && tail2==null){
                    tail.next=tail1;
                }
                else{
                    tail.next=tail2;
                }
            }
            return head;
            }

    public static void main(String[] args) {
        
        Node<Integer> node1=new Node<Integer>(1);
        // Node<Integer> node2=new Node<Integer>(3);
        // Node<Integer> node3=new Node<Integer>(5);
    
        Node<Integer> head1=node1;
        head1.next=node2;
        node2.next=node3;
        node3.next=null;
        
        Node<Integer> node4=new Node<Integer>(2);
        Node<Integer> node5=new Node<Integer>(4);
        Node<Integer> node6=new Node<Integer>(6);
        Node<Integer> node7=new Node<Integer>(7);
        Node<Integer> node8=new Node<Integer>(8);
    
        Node<Integer> head2=node4;
        head2.next=node5;
        node5.next=node6;
        node6.next=node7;
        node7.next=node8;
        node8.next=null;

        print(head1);
        System.out.println("");
        print(head2);
        System.out.println("");

        Node<Integer> head=merge(head1, head2);
        print(head);
        }
    }
    
