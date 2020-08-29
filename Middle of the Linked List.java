class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        ListNode slow = head;
        ListNode fast = slow.next;
        while (fast != null) {
            if (fast == null)
                return slow;
            if (fast.next == null)
                return slow.next;
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}