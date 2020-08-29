class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null || head.next==null) {
            return head;
        }
        
        ListNode odd = head;
        ListNode even = head.next;
        
        // save the even head to link it with odd nodes later
        ListNode evenHead = even;
        
        //keep linking odd nodes and even nodes separately
        while(odd.next!=null && odd.next.next!=null) {
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        
        // at the end link the odd list with even list
        odd.next = evenHead;
        return head;
        
    }
}