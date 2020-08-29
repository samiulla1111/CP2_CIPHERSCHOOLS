class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode node = head;
        
        // Count length of list
        int len = 0;
        while(node != null){
            len++;
            node = node.next;
        }
        
        // Determine break point
        int pos = k % len;
        if(pos == 0)
            return dummy.next;
        node = head;
        while(len > pos + 1){
            node = node.next;
            len--;
        }
        
        // Break and relink the linked list
        ListNode tmp = node.next;
        ListNode point = dummy.next;
        dummy.next = tmp;
        node.next = null;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = point;
        
        return dummy.next;
    }
}