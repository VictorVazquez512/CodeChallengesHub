class Solution {
    private int curArea = 0;
    private int maxArea = 0;
    private int rows;
    private int cols;
    private int[][] grid;

    public int maxAreaOfIsland(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        this.grid = grid;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    dfs(i, j);
                    maxArea = Math.max(maxArea, curArea);
                    curArea = 0;
                }
            }
        }

        return maxArea;

    }

    private void dfs (int i, int j) {
        if (i >= rows || j >= cols || i < 0 
        || j < 0 || grid[i][j] == 0 || grid[i][j] == -1) return;

        grid[i][j] = -1;
        curArea++;
        dfs(i+1, j);
        dfs(i, j+1);
        dfs(i-1, j);
        dfs(i, j-1);

    }

}