/*给定一个所有节点为非负值的二叉搜索树，求树中任意两节点的差的绝对值的最小值。
示例 :
输入:
   1
    \
     3
    /
   2

输出:
1
解释:
最小绝对差为1，其中 2 和 1 的差的绝对值为 1（或者 2 和 3）。
注意: 树中至少有2个节点。*/
package zone.lin.leetcodeCN.Y2018.M06.D13;

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
	private int min = Integer.MAX_VALUE;  
    private Integer pre = null;  
      
    public int getMinimumDifference(TreeNode root) {  
            helper(root);  
              
            return min;  
    }  
    private void helper(TreeNode root){  
        if(root == null) return;  
        helper(root.right);  
        if(pre!= null){  
            min = Math.min(Math.abs(root.val - pre), min);  
            pre = root.val;  
        }else pre = root.val;  
          
        helper(root.left);  
          
    }  
}
class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }