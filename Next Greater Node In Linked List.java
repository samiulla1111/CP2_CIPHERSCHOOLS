class Solution {
    public int[] nextLargerNodes(ListNode head) {
        
        ListNode iterator = head; // Used to iterate over the list
        Stack<Integer> stack = new Stack<>(); 
        int len = 0; // to keep track of the size of the list
        int list [] = new int [10000]; // to store the contents of the list
        
        // Iterate over the list, fill the array with the list
        // contents and find out the size of the list
        while (iterator != null) {
            list[len] = iterator.val;
            iterator = iterator.next;
            len ++;
        }
        
        // New results array of the correct size
        int results [] = new int [len];
        
        // Iterate over list array from the back
        for (int i = len - 1; i >= 0; i --) {
            // While the stack is not empty
            while (!stack.isEmpty()) {
                int iter = stack.peek();
                // Check if the element whose index is at the top of 
                // stack is larger than the current element in the list array
                if (list[iter] > list[i]) {
                    // If it is set the element in the results array at that index
                    // to be it and push current element to the stack
                    results[i] = list[iter];
                    stack.push(i);
                    break;
                }
                // Otherwise pop the stack
                stack.pop();
            }   
            
            // If the stack is empty this means there is
            // no element greater than the current element
            // so put zero in the results array at this index
            // and push the current element on to the stack
            if (stack.isEmpty()) {
                results[i] = 0;
                stack.push(i);
            }
        }
        
        return results;
    }
}