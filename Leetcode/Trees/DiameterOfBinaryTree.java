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
    private int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return this.res;
    }

    private int dfs (TreeNode cur) {
        if (cur == null) return 0;

        int left = dfs(cur.left);
        int right = dfs(cur.right);

        res = Math.max(res, left + right);
        return 1 + Math.max(left, right);

    }

}