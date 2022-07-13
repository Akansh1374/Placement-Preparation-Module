import java.util.LinkedList;
import java.util.Queue;

public class BTreeProblems {

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
    static int total(BTreeNode<Integer> root){
        if(root==null) return 0;
        int leftNodeCount=total(root.left);
        int rightNodeCount=total(root.right);
        return rightNodeCount+leftNodeCount+1;
    }

    static int largestNode(BTreeNode<Integer> root){
        if(root==null) return -1;

        int leftMax = largestNode(root.left);
        int rigthMax = largestNode(root.right);

        return Math.max(root.data, Math.max(leftMax, rigthMax));
    }

    static int height(BTreeNode<Integer> root){
        if(root==null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1+Math.max(leftHeight , rightHeight);
    }

    static int leafNodes(BTreeNode<Integer> root){
        if(root==null) return 0;
        if(root.left==null && root.right == null) return 1;

        return (leafNodes(root.left) + leafNodes(root.right));
    }

    static BTreeNode<Integer> removeLeaves(BTreeNode<Integer> root){
        if(root==null) return null;
        if(root.left==null && root.right==null) return null;

        root.left = removeLeaves(root.left); //Method  will return null which means root.left will be null as it is the leaf node
        root.right = removeLeaves(root.right); //Method  will return null which means root.right will be null as it is the leaf node

        return root;
    }

    static BTreeNode<Integer> invertTree(BTreeNode<Integer> root){
        if(root==null) return null;
        invertTree(root.left);
        invertTree(root.right);

        BTreeNode<Integer> temp = root.left;
        root.left=root.right;
        root.right=temp;

        return root;
    }

    static boolean isBalanced(BTreeNode<Integer> root){
        if(root==null) return true;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs(leftHeight - rightHeight)>1) return false;

        boolean isBalancedLeft = isBalanced(root.left);
        boolean isBalancedRight = isBalanced(root.right);

        return isBalancedLeft && isBalancedRight; // logical statement which will return true if both of them are true
    }

    static void levelOrder(BTreeNode<Integer> root){
        Queue<BTreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while(queue!=null){
            BTreeNode<Integer> a = queue.poll();
            System.out.println(a.data);

            if(a.left!=null) queue.add(a.left);
            if(a.right!=null) queue.add(a.right);
        }
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

        levelOrder(root);
    }
}
