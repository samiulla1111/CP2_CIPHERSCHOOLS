class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null){
            while(fast != null && fast.val == slow.val)
                fast = fast.next;
            slow.next = fast;
            slow = slow.next;
        }
        return dummy.next;
    }
}