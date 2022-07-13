import java.util.Scanner;

public class UsingBtree {

    static void print(BTreeNode<Integer> root){
        if(root==null) 
            return;
        System.out.print(root.data+"->");
        print(root.left);
        print(root.right);
    }

    static void detailedPrint(BTreeNode<Integer> root){
        if(root==null) 
            return;
        System.out.print(root.data+":");
        
        if(root.left != null) 
            System.out.print("L-"+root.left.data+" ");
        if(root.right != null) 
            System.out.print("R-"+root.right.data+" ");
        System.out.println();
        detailedPrint(root.left);
        detailedPrint(root.right);
    }

    static BTreeNode<Integer> treeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data: ");

        int rootData=sc.nextInt();
        if(rootData==-1)
            return null;
        BTreeNode<Integer> root=new BTreeNode<>(rootData);
        System.out.println("In the left of "+rootData);
        BTreeNode<Integer> leftChild= treeInput();
        System.out.println("In the right of "+rootData);
        BTreeNode<Integer> rightChild=treeInput();
        root.left=leftChild;
        root.right=rightChild;

        return root;
    }

    public static void main(String[] args) {
        BTreeNode<Integer> root = new BTreeNode<>(0);
        BTreeNode<Integer> one = new BTreeNode<>(1);
        BTreeNode<Integer> two = new BTreeNode<>(2);
        BTreeNode<Integer> three = new BTreeNode<>(3);
        BTreeNode<Integer> four = new BTreeNode<>(4);
        BTreeNode<Integer> five = new BTreeNode<>(5);
        BTreeNode<Integer> six = new BTreeNode<>(6);

        root.left=one;
        root.right=two;
        one.left=three;
        one.right=four;
        two.left=five;
        two.right=six;

        detailedPrint(root);

    }
}
