class Solution {
    TreeNode prev=null;
    public void flatten(TreeNode root) {
         flat(root);
    }
    public void flat(TreeNode node){
        if(node==null) return;
        TreeNode left=node.left;
        TreeNode right=node.right;        // storing left and right child of node for further recursion
        if(prev!=null){
            prev.right=node;     // adding node to the right side of previous node
        }
        node.left=null;
        prev=node;  // prev points to the previous node in preorder
        flat(left);
        flat(right);
    }
}