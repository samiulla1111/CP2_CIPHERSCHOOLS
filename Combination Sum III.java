class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum3(int k, int n) {
        result = new ArrayList<>();
        getCombination(1, k, n, new LinkedList<Integer>());
        return result;
    }
    
    private void getCombination(int index, int k, int n, LinkedList<Integer> list){
        if(list.size() == k){
            if(n == 0)
                result.add(new ArrayList<>(list));
            return;
        }
        
        for(int i = index; i <= Math.min(n, 9); i++){
            list.add(i);
            getCombination(i+1, k, n - i, list);
            list.removeLast();
        }
    }
}