class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        swapPairsHelper(head);
        return head;
        
    }
    
    public void swapPairsHelper(ListNode node){
        
        if(node == null || node.next == null) return;        
    
        int temp = node.val;
        node.val = node.next.val;
        node.next.val = temp;
        swapPairsHelper(node.next.next);
    }
}