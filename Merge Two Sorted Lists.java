class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=null;
        ListNode temp= new ListNode();
        int insertVal=0;
        while(l1 !=null || l2!=null){
            if(l1 !=null && l2!=null){
                 if(l1.val<=l2.val){
                    insertVal=l1.val;
                    l1=l1.next;
            }
                else{
                     insertVal=l2.val;
                    l2=l2.next;
                }
            }
            else{
                if(l1==null){
                     insertVal=l2.val;
                    l2=l2.next;
                }
                else{
                     insertVal=l1.val;
                    l1=l1.next;
                }
            }
            if(head!=null){
                temp.next= new ListNode(insertVal);
                temp=temp.next;
            }
           else{
               head=new ListNode(insertVal);
               temp= head;
           }
        }
        return head;
    }
}