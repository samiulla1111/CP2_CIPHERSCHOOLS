class Solution {
    public  Map<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
			map.put(inorder[i], i);
		}
		AtomicInteger pIndex = new AtomicInteger(0);

		return construct(0, inorder.length - 1, preorder, pIndex);
	}
	
	
	public TreeNode construct(int start, int end, int[] preorder, AtomicInteger pIndex) {
		// base case
		if (start > end) {
			return null;
		}

		TreeNode root = new TreeNode(preorder[pIndex.getAndIncrement()]);
		
		if (start == end) 
            return root; 
		
		int indexInorder = map.get(root.val);

		root.left = construct(start, indexInorder - 1, preorder, pIndex);
		root.right = construct(indexInorder + 1, end, preorder, pIndex);

		return root;
	}
}