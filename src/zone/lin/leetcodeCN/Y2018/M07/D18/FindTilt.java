package zone.lin.leetcodeCN.Y2018.M07.D18;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
	int res=0;
    public int findTilt(TreeNode root) {
        sum(root);
        return res;
    }
    public int sum(TreeNode root) {
    	if(root==null)
        	return 0;
        int left=sum(root.left);//左子树之和
        int right=sum(root.right);//右子树之和
        res+=left>right?left-right:right-left;//两子树之差的和
        return left+right+root.val ;
    }
}
class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }