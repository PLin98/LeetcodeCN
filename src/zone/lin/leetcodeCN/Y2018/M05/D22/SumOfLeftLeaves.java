/*计算给定二叉树的所有左叶子之和。
示例：
    3
   / \
  9  20
    /  \
   15   7
在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24*/
package zone.lin.leetcodeCN.Y2018.M05.D22;
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
    public int sumOfLeftLeaves(TreeNode root) {
    	int sum=0;
        if(root==null)
        	return 0;
        if(root.left!=null)
	        if(root.left.left==null&&root.left.right==null)
	        	sum+=sumOfLeftLeaves(root.left);//左叶子相加
        if(root.right!=null)
        	sum+=sumOfLeftLeaves(root.right);
        return sum;
    }
}
class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }