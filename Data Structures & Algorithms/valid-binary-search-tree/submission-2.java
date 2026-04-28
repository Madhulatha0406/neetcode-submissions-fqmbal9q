class Solution {
    TreeNode prev = null;
    //inplace soln

    private boolean inorder(TreeNode root){
        if(root == null) return true;

        // check left subtree
        if(!inorder(root.left)) return false;

        // current node check
        if(prev != null && root.val <= prev.val){
            return false;
        }

        // update prev
        prev = root;

        // check right subtree
        return inorder(root.right);
    }

    public boolean isValidBST(TreeNode root) {
        return inorder(root);
    }
}