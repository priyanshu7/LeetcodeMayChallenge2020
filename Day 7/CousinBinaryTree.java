package may2020;

import java.util.*;

public class CousinBinaryTree {
	
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	
	
	
	public boolean isCousins(TreeNode root, int x, int y) {
		TreeNode parentX = null;
		TreeNode parentY = null;
		int xLevel = -1, yLevel = -1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 0;
        while(!q.isEmpty()) {
        	int size = q.size();
        	level++;
        	while(size-->0) {
        		TreeNode temp = q.remove();
        		if(temp.left != null) {
        			q.offer(temp.left);
        			if(temp.left.val == x) {
        				parentX = temp;
        				xLevel = level;
        			}else if(temp.left.val == y) {
        				parentY = temp;
        				yLevel = level;
        			}
        		}
        		if(temp.right != null) {
        			q.offer(temp.right);
        			if(temp.right.val == x) {
        				parentX = temp;
        				xLevel = level;
        			}else if(temp.right.val == y) {
        				parentY = temp;
        				yLevel = level;
        			}
        		}
        	}
        }
        if(xLevel == yLevel && parentX != parentY)
        	return true;
        return false;
    }


}
