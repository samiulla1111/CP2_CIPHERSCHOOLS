class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> finalList = new ArrayList<>();
        if (root == null) return finalList;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int round = 2;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                list.add(temp.val);

                if (temp.right != null) queue.add(temp.right);
                if (temp.left != null) queue.add(temp.left);

            }
            if(round%2 == 0) Collections.reverse(list);
            finalList.add(list);
            round++;
        }
        return finalList;
    }
}