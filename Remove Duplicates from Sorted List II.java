class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode node = head;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(node !=null){
            map.put(node.val, map.getOrDefault(node.val, 0) + 1);
            node = node.next;
        }
        node = dummy;
        while(node.next != null){
            ListNode tmp = node.next;
            boolean duplicate = map.get(tmp.val) > 1 ? true : false;
            while(duplicate){
                tmp = tmp.next;
                if(tmp == null)
                    break;
                duplicate = map.get(tmp.val) > 1 ? true : false;
            }
            node.next = tmp;
            node = node.next;
            if(node == null)
                break;
        }
        return dummy.next;
    }
}