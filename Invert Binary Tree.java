class Solution {
    public TreeNode invertTree(TreeNode root) {
       return createMirror (root);
    }
    
    TreeNode createMirror (TreeNode node) {
        if (node == null)  return node;
        
        TreeNode left = createMirror (node.left);
        TreeNode right = createMirror(node.right);
        
        node.left = right;
        node.right = left;
        
        return node;
    }
}