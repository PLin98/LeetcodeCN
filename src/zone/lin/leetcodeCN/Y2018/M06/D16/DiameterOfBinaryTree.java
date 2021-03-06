/*给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。
示例 :
给定二叉树

          1
         / \
        2   3
       / \     
      4   5    
返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
注意：两结点之间的路径长度是以它们之间边的数目表示。*/
package zone.lin.leetcodeCN.Y2018.M06.D16;
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
	int count;
    public int diameterOfBinaryTree(TreeNode root) {
        int count=0;
        Max(root);
        return count;
    }
    public int Max(TreeNode root) {
    	if(root==null) 
    		return -1;
    	int left=Max(root.left);
    	int right=Max(root.right);
    	int temp=left+right+2;
    	if(temp>count)
    		count=temp;
    	return Math.max(left, right)+1;
    }
}
class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
