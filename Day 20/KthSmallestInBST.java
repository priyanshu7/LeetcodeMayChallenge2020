package may2020;

import biweeklyMay.GoodNodes.TreeNode;

public class KthSmallestInBST {
	
	private int c = 0;
    private int ans = 0;
	
	public void kSmallest(TreeNode root, int k) {
		if(root == null)
			return;
		kSmallest(root.left, k);
        c++;
        if(c == k)
            ans = root.val;
		kSmallest(root.right, k);
	}
    
    public int kthSmallest(TreeNode root, int k) {
        if(root == null)
			return 0;
		kSmallest(root, k);
        return ans;
    }

}
