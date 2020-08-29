class Solution {
    private int maxDia = 0;
    private int helper(TreeNode root){
        if(root == null)
            return 0;
        
        int left = helper(root.left);
        int right = helper(root.right);
        
        int diameter = left + right;
        maxDia = Math.max(diameter, maxDia);
        
        return (Math.max(left, right) + 1);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int h = helper(root);
        return maxDia;
    }
}