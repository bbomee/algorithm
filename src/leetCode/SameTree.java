package leetCode;

import java.util.ArrayList;
import java.util.List;

import sun.net.www.content.text.plain;

public class SameTree {
	 /* Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */
	public static void main(String[] args) {
		TreeNode p = new TreeNode(2);
		TreeNode pl = new TreeNode(2);
		TreeNode pr = new TreeNode(4);
		p.left = pl;
		p.right = pr;
		
		TreeNode q = new TreeNode(2);
		TreeNode ql = new TreeNode(2);
		TreeNode qr = new TreeNode(4);
		q.left = ql;
		q.right = qr;
		
		isSameTree(p, q);
	}
	
    public static boolean isSameTree(TreeNode p, TreeNode q) {
    	if(p == null || q == null) {
    		return false;
    	}
    	//System.out.println(p.val + " " + p.left.val + " " + p.right.val);
        List<Integer> pList = new ArrayList<>();
        List<Integer> qList = new ArrayList<>();
        arrListTree(pList, p);
        arrListTree(qList, q);

    	return pList.toString().equals(qList.toString());
    }

   public static List<Integer> arrListTree(List<Integer> listTree, TreeNode t) {
	   listTree.add(t.val);
	   
	   if(t.left != null) {
    		arrListTree(listTree,t.left);
    	} else if(t.left == null && t.right != null) {
    		listTree.add(null);
    	}
	   
    	if(t.right != null) {	
    		arrListTree(listTree, t.right);
    	}

    	return listTree;
    } 
}
