class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //Initiate the head node
        ListNode fakeHead = new ListNode(0);
        ListNode currentNode = fakeHead;
        int carrier = 0;
        //Declare l1Value and l2Value
        int l1Value;
        int l2Value;
        
        if ((l1 == null) && (l2 == null))
            return new ListNode(0);
        
        while ((l1 != null) || (l2 != null)) {
            
            l1Value = (l1 != null) ? l1.val : 0;
            l2Value = (l2 != null) ? l2.val : 0;
            
            ListNode nextNode = new ListNode(0);
            nextNode.val =  l1Value + l2Value + carrier;
            if (nextNode.val > 9) {
                carrier = 1;
                nextNode.val = nextNode.val % 10;
            } else carrier = 0;
            
            currentNode.next = nextNode;
            currentNode = nextNode;
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        if (carrier > 0) {
            ListNode carrierNode = new ListNode(1);
            currentNode.next = carrierNode;
        }
        
        return fakeHead.next;
    }
}