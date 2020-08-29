class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(height(root.left) - height(root.right)) > 1) return false;
        else return isBalanced(root.left) && isBalanced(root.right);
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
}