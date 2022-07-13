public class QueueLL {
    static private Node<Integer> front=null;
    static private Node<Integer> rear=null;
    static private int size=0;

    static int getSize(){
        return size;
    }

    static boolean isEmpty(){
        if(getSize()==0)
            return true;
        else
            return false;
    }

    static Integer getFront(){
        if(getSize()==0){
            return -1;
        }
        return front.data;
    }

    static Integer getRear(){
        if(getSize()==0){
            return -1;
        }
        return rear.data;
    }

    static void enqueue(Integer element){
        Node<Integer> newNode=new Node<>(element);
        if(getSize()==0){
            front=newNode;
            rear=newNode;
        }
        else
            rear.next=newNode;

        size++;
    }
    
    static void dequeue(Integer element){
        Node<Integer> newNode=new Node<>(element);
        if(getSize()==0){
            return;
        }
            Integer temp=front.data;
            front=front.next;
            if(getSize()==1){
                rear=null;
            }
            size--;

            return temp;
    }

}
