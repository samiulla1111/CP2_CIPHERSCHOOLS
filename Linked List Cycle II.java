public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head; 
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next; 
            if(slow==fast){
                ListNode ans = head; 
                while(ans!=null){
                   if(slow==ans) return ans; 
                    ans = ans.next; 
                    slow = slow.next; 
                }
            }
        }
        return null; 
    }
}