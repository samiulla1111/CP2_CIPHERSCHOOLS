class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>((n1, n2) -> n2 - n1);
        for(int num: nums) q.add(num);
        int result = 0;
        while(k>0) {
            result = q.poll();
            k--;
        }
        return result;
    }
}