/*给定一个二叉树，返回从根节点到叶节点的所有路径。
例如，给定以下二叉树:
   1
 /   \
2     3
 \
  5
所有根到叶路径是:
["1->2->5", "1->3"]*/
package zone.lin.leetcodeCN.Y2018.M05.D04;

import java.util.ArrayList;
import java.util.List;

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
    public List<String> binaryTreePaths(TreeNode root) {
    	List<String> list = new ArrayList<>();  
        if (root == null) 
        	return list;  
        Tree(root,list,"");  
        return list;  
    }  
      
    public void Tree(TreeNode root,List<String> list,String string){  
        string += root.val + " ";  
        if (root.left == null && root.right == null)  
            list.add(string.trim().replace(" ","->"));  
  
        if (root.left != null)  
            Tree(root.left,list,string);  
  
        if (root.right != null)  
            Tree(root.right,list,string);  
    }
}
class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }