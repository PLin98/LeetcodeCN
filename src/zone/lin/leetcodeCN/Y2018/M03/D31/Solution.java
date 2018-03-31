//将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
//此题中，一个高度平衡二叉树是指一个二叉树每个节点的左右两个子树的高度差的绝对值不超过1。
//示例:
//给定有序数组: [-10,-3,0,5,9],
//一种可行答案是：[0,-3,9,-10,null,5]，它可以表示成下面这个高度平衡二叉搜索树：
//      0
//     / \
//   -3   9
//   /   /
// -10  5
package zone.lin.leetcodeCN.Y2018.M03.D31;
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null||nums.length==0)
        	return null;
        return sort(nums,0,nums.length-1);
    }
    public TreeNode sort(int[] nums,int low,int high)
    {
    	if(low>high)
    		return null;
    	int mid=(low+high)/2;
    	if((high-low)%2==1)
    		mid++;
    	TreeNode node=new TreeNode(nums[mid]);
    	node.left=sort(nums,low,mid-1);
    	node.right=sort(nums,mid+1,high);
    	return node;
    }
}
class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }