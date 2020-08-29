class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null)
            return new ListNode();
        ListNode[] ptr = new ListNode[lists.length];
        for(int i=0; i<lists.length; i++)
        {
            ptr[i] = lists[i];
        }
        ListNode head = new ListNode();
        head = null;
        ListNode cur = head;
        int min=-1;  //to store index of least value among all lists
        int val = Integer.MAX_VALUE;
        int flag = 0;
        
        while(flag!=1)
        {
            val = Integer.MAX_VALUE;
            min=-1;
            for(int i=0; i<lists.length; i++)   //get minimum value
            {
                if(ptr[i]!=null)
                {
                    if(val>ptr[i].val)
                    {
                        val = ptr[i].val;
                        min = i;
                    }
                }  
            }
            if(val==Integer.MAX_VALUE && min==-1)   //all linked lists travelled
            {
                flag=1;
                break;
            }
            
            ListNode temp = new ListNode(val);
            ptr[min] = ptr[min].next;
            if(head==null)
            {
                head = temp;
                cur = head;
            }
            else
            {
                cur.next = temp;
                cur = temp;
            }
            
        }
        
        return head;
    }
}