class Solution {
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        process(root);
        return res;
    }
    
    private int process(TreeNode root){
        if(root == null) return 0;
        //use max(0,xxx) is very important !!!
        int left  = Math.max(0,process(root.left));
        int right = Math.max(0,process(root.right));
        res = Math.max(res,left + root.val + right);
        return Math.max(left,right) + root.val;
    }
}