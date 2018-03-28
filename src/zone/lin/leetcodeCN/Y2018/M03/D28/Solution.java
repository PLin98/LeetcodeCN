/*
给定两个二叉树，写一个函数来检查它们是否相同。
如果两棵树在结构上相同并且节点具有相同的值，则认为它们是相同的。
示例 1:
输入 :     1          1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]
输出: true
示例 2:
输入  :    1          1
          /           \
         2             2

        [1,2],     [1,null,2]
输出: false
例 3:
输入 :     1          1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]
输出: false
*/
package zone.lin.leetcodeCN.Y2018.M03.D28;
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	if(p==null&&q==null)
    		return true;
    	if(p==null&&q!=null)
    		return false;
    	if(p!=null&&q==null)
    		return false;
        if(p.val!=q.val)
        	return false;
        return (isSameTree(p.left,q.left)&&isSameTree(p.right,q.right));
    }
}
class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }