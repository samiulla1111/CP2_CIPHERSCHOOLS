class Solution {
    int[] depths  = new int[2];
    TreeNode[] parents = new TreeNode[2];
    int index = 0;
    
    public boolean isCousins(TreeNode root, int x, int y) {
       
        findDepth(root, root, 0, x);
        findDepth(root, root, 0, y);
        
        return depths[0] == depths[1] && parents[0] != parents[1];  
    }
    
    public int findDepth(TreeNode root, TreeNode parent, int count, int x) { 
        if(root == null) return count;
        
        if(root.val == x) {
            depths[index] = count;
            parents[index++] = parent;
            return count;
        }
        
        findDepth(root.left, root, count + 1, x);
        findDepth(root.right, root , count + 1, x);
        
        return count;
        
    }
}