/*给定一棵二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
百度百科中最近公共祖先的定义： “对于有根树T的两个结点u、v，最近公共祖先表示一个结点x，
满足x是u、v的祖先且x的深度尽可能大。”（一个节点也可以是它自己的祖先）

        _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5
例如, 节点 2 和 8的最近公共祖先是 6。再举个例子，节点 2 和 4 的最近公共祖先是 2, 
因为根据定义最近公共祖先节点可以为指定节点自身。*/

package zone.lin.leetcodeCN.Y2018.M05.D02;
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
        	return null;
        if(root.val<p.val&&root.val<q.val)
        	return lowestCommonAncestor(root.right,p,q);
        else if(root.val>p.val&&root.val>q.val)
        	return lowestCommonAncestor(root.left,p,q);
        else
        	return root;
    }
}
class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }