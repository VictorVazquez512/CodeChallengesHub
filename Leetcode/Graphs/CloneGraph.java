/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Node, Node> oldToNew;

    public Node cloneGraph(Node node) {
        if (node == null) return null;

        oldToNew = new HashMap<>();
        return dfs(node);

    }

    private Node dfs (Node node) {
        if (oldToNew.containsKey(node)) {
            return oldToNew.get(node);
        }

        Node copy = new Node(node.val);
        oldToNew.put(node, copy);

        for (Node neighbor : node.neighbors ) {
            copy.neighbors.add(dfs(neighbor));
        }

        return copy;

    }

}