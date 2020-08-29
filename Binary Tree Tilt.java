class Solution {
    int tilt = 0;
    public int findTilt(TreeNode root) {
        if(root == null ||(root.left==null && root.right==null)) return tilt;
        findSum(root);
        return tilt;
    }
    public int findSum(TreeNode root)
    {
        if(root==null) return 0;
        int left = findSum(root.left);
        int right = findSum(root.right);
        tilt+=Math.abs(left - right);
        return left+right+root.val;
    }
}