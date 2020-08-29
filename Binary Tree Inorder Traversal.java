class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        //Recursive solution 
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }
    private void helper(TreeNode node, List<Integer> list){
        if(node==null) return; 
        helper(node.left, list);
        list.add(node.val);
        helper(node.right, list); 
    }
}