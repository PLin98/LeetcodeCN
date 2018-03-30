//给定一个二叉树，找出其最大深度。
//二叉树的深度为根节点到最远叶节点的最长路径上的节点数。
//案例：
//给出二叉树 [3,9,20,null,null,15,7]，
//    3
//   / \
//  9  20
//    /  \
//   15   7
//返回最大深度为 3 。
package zone.lin.leetcodeCN.Y2018.M03.D30;
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
    public int maxDepth(TreeNode root) {
        int ldep,rdep;
        if(root==null)
        	return 0;
        else
        {
        	ldep=maxDepth(root.left);
        	rdep=maxDepth(root.right);
        	return(ldep>rdep)?(ldep+1):(rdep+1);
        }
    }
}
class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
