public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        
        ListNode curr = headA;
        while(curr != null){
            lenA++;
            curr = curr.next;
        }
        
        curr = headB;
        while(curr != null){
            lenB++;
            curr = curr.next;
        }
                
        if(lenB > lenA){
            for(int i = 0; i < lenB - lenA; i++) headB = headB.next;
        }
        else if(lenA > lenB){
            for(int i = 0; i < lenA - lenB; i++) headA = headA.next;
        }
                
        while(headA != null && headB != null && headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        
        return headA;
    }
}