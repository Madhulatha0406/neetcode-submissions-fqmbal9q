//dfs
class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        dfs(root, 0);
        return ans;
    }

    public void dfs(TreeNode root, int level) {

        if (root == null)
            return;

        // First time visiting this level
        if (ans.size() == level) {
            ans.add(new ArrayList<>());
        }

        // Add current node to its level
        ans.get(level).add(root.val);

        // Visit left and right children
        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }
}