public class StackUsingLL {
    Node<Integer> head = null;
    int size = 0;
    // public static void print(){
    //     Node<Integer> tail=head;
    //     while(tail!=null){
    //         System.out.print(tail.data+" ");
    //         tail=tail.next;
    //     }
    // }

    public int size() {
        return size;
    }
    
    public boolean isEmpty(){
        return size()==0;
    }

    public Integer top() {
        if(head==null){
            return -1;
        }
        return head.data;
    }

    public void push(Integer element){
        Node<Integer> newNode=new Node<Integer>(element);
        newNode.next=head;
        head=newNode;
        size++;
    }

    public Integer pop() {
        if(size==0){
            return -1;
        }
        Integer temp=head.data;
        head=head.next;
        size--;
        return temp;
    }
}
