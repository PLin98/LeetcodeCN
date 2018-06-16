package zone.lin.leetcodeCN.Y2018.M06.D14;
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
    public TreeNode convertBST(TreeNode root) {
        int sum=0;
        convert(root,sum);
        return root;
    }
    
    public void convert(TreeNode root,int sum) {
    	if(root!=null) {  
    		convert(root.right, sum);  
            sum += root.val;  
            root.val = sum;  
            convert(root.left, sum);  
        }  
    }
}
class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }