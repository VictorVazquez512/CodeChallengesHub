// BFS Iterative Approach
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int level = 0;
        int level_size;
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode temp;

        q.add(root);
        while (!q.isEmpty()) {
            level_size = q.size();
            for (int i = 0; i < level_size; i++) {
                temp = q.remove();
                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }
            level++;
        }

        return level;

    }
}


// DFS Recursive Approach
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}


// DFS Iterative Approach
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, 1)); // Store the node and its depth
        int res = 0;

        while (!stack.isEmpty()) {
            Pair current = stack.pop();
            TreeNode node = current.node;
            int depth = current.depth;

            if (node != null) {
                res = Math.max(res, depth);
                stack.push(new Pair(node.left, depth + 1));
                stack.push(new Pair(node.right, depth + 1));
            }
        }

        return res;
    }

    // Helper class to store node and its depth
    private static class Pair {
        TreeNode node;
        int depth;

        Pair(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }
}