class Solution {

    int preIndex = 0;   // tracks current root in preorder
    HashMap<Integer,Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        // store inorder value -> index
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length-1);
    }

    public TreeNode build(int[] preorder, int inStart, int inEnd){

        if(inStart > inEnd){
            return null;
        }

        int rootVal = preorder[preIndex];
        preIndex++;

        TreeNode root = new TreeNode(rootVal);

        int pos = map.get(rootVal);

        root.left = build(preorder, inStart, pos-1);
        root.right = build(preorder, pos+1, inEnd);

        return root;
    }
}