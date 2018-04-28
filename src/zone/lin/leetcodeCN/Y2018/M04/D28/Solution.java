/*翻转一棵二叉树。

     4
   /   \
  2     7
 / \   / \
1   3 6   9
转换为：

     4
   /   \
  7     2
 / \   / \
9   6 3   1*/

package zone.lin.leetcodeCN.Y2018.M04.D28;
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
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp;
        if(root!=null)
        {
	        invertTree(root.left);
	        invertTree(root.right);
	        temp=root.left;
	        root.left=root.right;
	        root.right=temp;
        }
        return root;
    }
}
class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }