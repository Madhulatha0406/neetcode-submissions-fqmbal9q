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
     int preIndex = 0;
      HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       
        int n = inorder.length;
        for(int i =0;i<n;i++){
            map.put(inorder[i],i);
        }
         return build(preorder, 0, inorder.length - 1);
    }
     public TreeNode build(int[] preorder, int inStart, int inEnd){
        
        if(inStart > inEnd){
            return null;
        }
        
        int rootVal = preorder[preIndex];
        preIndex++;
        
        TreeNode root = new TreeNode(rootVal);
        
        int pos = map.get(rootVal);
        
        root.left = build(preorder, inStart, pos - 1);
        root.right = build(preorder, pos + 1, inEnd);
        
        return root;
    }
}
