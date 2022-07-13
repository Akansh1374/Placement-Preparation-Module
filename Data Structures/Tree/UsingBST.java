public class UsingBST {

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

    static boolean searchBST(BTreeNode<Integer> root, int target){
        if(root == null) return false;
        if(root.data == target) return true;

        if(root.data<target) 
            return searchBST(root.right,target);
        else 
            return searchBST(root.left,target);
    }

    static void betweenK1K2(BTreeNode<Integer> root,int k1,int k2){
        if(root==null) return;
        if(root.data<k1)
            betweenK1K2(root.left, k1, k2);
        if(root.data>k2)
            betweenK1K2(root.right, k1, k2);
        else{
            System.out.println(root.data);
            betweenK1K2(root.left, k1, k2);
            betweenK1K2(root.right, k1, k2);
        }
    }

    public static BTreeNode<Integer> helpSortedArrayToBST(int[] nums,int low,int high){
        int mid = (low + high)/2;
        if (low>high) return null;
        
        BTreeNode<Integer> temp = new BTreeNode<>(nums[mid]);
        temp.left = helpSortedArrayToBST(nums,low, mid-1);
        temp.right = helpSortedArrayToBST(nums, mid+1, high);
        return temp;
    }
    public static BTreeNode<Integer> sortedArrayToBST(int[] nums) {
        return helpSortedArrayToBST(nums,0,nums.length-1);
    }

    public static int max(BTreeNode<Integer> root){
        if(root==null) return Integer.MIN_VALUE;
        int leftMax = max(root.left);
        int rightMax = max(root.right);
        
        return Math.max(root.data , Math.max(leftMax,rightMax));
    }
    public static int min(BTreeNode<Integer> root){
        if(root==null) return Integer.MAX_VALUE;
        int leftMin = min(root.left);
        int rightMin = min(root.right);

        return Math.min(root.data , Math.min(leftMin,rightMin));
    }
        
    public static boolean isValidBST(BTreeNode<Integer> root) {
        if(root==null) return true;
        int leftMax = max(root.left);
        int rightMin = min(root.right);
        if(leftMax>=root.data) return false;
        if(rightMin<=root.data) return false;
        
        boolean leftCheck = isValidBST(root.left);
        boolean rightCheck = isValidBST(root.right);

        return leftCheck && rightCheck;
    }

    public static boolean isValidBSTopt(BTreeNode<Integer> root,int max,int min){
        if(root==null) return true;
        if(root.data<min || root.data>max) return false;
        
        boolean isLeftBalanced = isValidBSTopt(root.left,root.data-1 , min);
        boolean isRightBalanced = isValidBSTopt(root.right,max , root.data + 1);

        return isLeftBalanced && isRightBalanced;
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

        int[] nums = {1,2,3,4,5,6,7,8,9};
        BTreeNode<Integer> temp = sortedArrayToBST(nums);
        detailedPrint(temp);
    }
}
