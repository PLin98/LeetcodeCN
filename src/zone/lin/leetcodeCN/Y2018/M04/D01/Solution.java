//给定一棵二叉树和一个总和，确定该树中是否存在根到叶的路径，这条路径的所有值相加等于给定的总和。
//例如：
//给定下面的二叉树和 总和 = 22，
//
//              5
//             / \
//            4   8
//           /   / \
//          11  13  4
//         /  \      \
//        7    2      1
//返回 true, 因为存在总和为 22 的根到叶的路径 5->4->11->2。
package zone.lin.leetcodeCN.Y2018.M04.D01;
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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
        	return false;
        else if(root.left==null&&root.right==null&&root.val==sum)
        	return true;
        else
        	return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
        
    }
}
class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }