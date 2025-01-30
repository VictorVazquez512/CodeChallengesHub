class Solution {
    public int findJudge(int n, int[][] trust) {
        Map<Integer, Integer> incomingTrusts = new HashMap<>();
        Map<Integer, Integer> outgoingTrusts = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            outgoingTrusts.put(i, 0);
            incomingTrusts.put(i, 0);
        }

        for (int[] edge : trust) {
            outgoingTrusts.put(edge[0], outgoingTrusts.get(edge[0]) + 1);
            incomingTrusts.put(edge[1], incomingTrusts.get(edge[1]) + 1);
        }

        for (int i = 1; i <= n; i++) {
            if (outgoingTrusts.get(i) == 0 && incomingTrusts.get(i) == n - 1) {
                return i;
            }
        }

        return -1;

    }
}