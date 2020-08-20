class Solution {
   public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        for(; i < nums.length; i++) {
            int len = i - j + 1;
            if(len == k) {
                int max = nums[j];
                for(int p = j; p <= i; p++) {
                    max = Math.max(max, nums[p]);
                }
                result.add(max);
                j++;
            }
        }
        int[] ans = new int[result.size()];
        for(int n = 0; n < result.size(); n++) {
            ans[n] = result.get(n);
        }
        return ans;
    }
}