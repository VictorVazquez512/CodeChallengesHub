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

    LinkedList<Integer> ans;

    public List<Integer> postorderTraversal(TreeNode root) {
        ans = new LinkedList<>();
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode node) {
        if (node == null) return;

        dfs(node.left);
        dfs(node.right);
        ans.add(node.val);

    }

}