public class BTreeNode<T>{
    T data;
    BTreeNode<T> left;
    BTreeNode<T> right;

    BTreeNode(T data){
        this.data = data;
    }
}