package may2020;

import biweeklyMay.GoodNodes.TreeNode;

public class BSTFromPreorder {
	
	private static TreeNode helper(int[] preorder, int start, int end){
        if(start>end)
            return null;
        
        TreeNode root = new TreeNode(preorder[start]);
        
        if(start==end)
            return root;
        
        
        int leftEnd=start+1;
        while(leftEnd<=end && preorder[leftEnd]<preorder[start])
            leftEnd++;
        
        root.left = helper(preorder, start+1, leftEnd-1);
        root.right = helper(preorder, leftEnd, end);
        
        return root;
        
        
    }
    
    public static TreeNode bstFromPreorder(int[] preorder) {
        
        return helper(preorder,0,preorder.length-1);
    }

}
