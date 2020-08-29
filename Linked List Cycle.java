public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
            
        while (fastPtr != null && fastPtr.next != null)
        {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
                
            if (fastPtr == slowPtr)
            {
                return true;
            }
        }
        return false;
    }
}