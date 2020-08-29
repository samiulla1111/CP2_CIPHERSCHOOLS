class Solution {
    private void dfs(List<Integer> l, int k, int index, LinkedList<Integer> comb, List<List<Integer>> ans) {
        if (k == 0) {
            ans.add(new ArrayList(comb));
            return;
        }
        
        Integer prev = null;
        for (int i=index; i < l.size()-k+1; i++) {
            int c = l.get(i);
            if (prev == null || prev != c) prev = c;
            else continue;
            comb.push(c);
            dfs(l, k-1, i+1, comb, ans);
            comb.pop();
        }
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> l = new ArrayList();
        for (int num: nums) l.add(num);
        Collections.sort(l);
        for (int k=0; k <= l.size(); k++) dfs(l, k, 0, new LinkedList(), ans);
        return ans;
    }
}