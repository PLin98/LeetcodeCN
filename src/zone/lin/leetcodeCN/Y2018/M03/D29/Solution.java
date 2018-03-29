//给定一个二叉树，检查它是否是它自己的镜像（即，围绕它的中心对称）。
//例如，这个二叉树 [1,2,2,3,4,4,3] 是对称的。
//    1
//   / \
//  2   2
// / \ / \
//3  4 4  3
//但是下面这个 [1,2,2,null,3,null,3] 则不是:
//    1
//   / \
//  2   2
//   \   \
//   3    3
package zone.lin.leetcodeCN.Y2018.M03.D29;
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
    public boolean isSymmetric(TreeNode root) {
    	if(root==null)
    		return true;
    	if(root!=null&&root.left==null&&root.right==null)
    		return true;
    	return istrue(root.left,root.right);
    }
    public boolean istrue(TreeNode left,TreeNode right)
    {
    	if(left==null&&right==null)
    		return true;
    	else if(left==null||right==null)
    		return false;
    	else
    		return (left.val==right.val&&istrue(left.right,right.left)&&istrue(left.left,right.right));
    }
}
class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }