/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    
    public int maxDepth(TreeNode root) {
      return helper(root,0);
        
    }
    public int helper(TreeNode root, int h){
        
   // int h =0;
  
        if(root==null) return h;
        h++;
        return Math.max(helper(root.right,h), helper(root.left,h));
        
    


    }
}
