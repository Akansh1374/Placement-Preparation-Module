class Solution {
    public ListNode mergeTwoLists(ListNode tail1, ListNode tail2) {
        
        ListNode tail1=null;
        ListNode tail2=null;
        
        ListNode head=null;
        ListNode tail=null;
        
        if(tail1.val>=tail2.val){
            head=tail2;
            tail=tail2;
            tail2=tail2.next;
        }
        else{
            head=tail1;
            tail=tail1;
            tail1=tail1.next;
        }
        
        while(tail1!=null && tail2!=null){
            if(tail1.val>=tail2.val){
                tail.next=tail2;
                tail2=tail2.next;
                tail=tail.next;
            }
            else{
                tail.next=tail1;
                tail1=tail1.next;
                tail=tail.next;
            }
            if(l)
        }
    }
}