class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        if(root == null) return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int level = queue.size();
            for(int i=0;i<level-1;i++)
            {
                TreeNode node = queue.poll();
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            TreeNode x = queue.poll();
            if(x.left != null) queue.offer(x.left);
            if(x.right != null) queue.offer(x.right);
            ans.add(x.val);
            
        }
        return ans;
    }
}