class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        
        boolean direction_up = true;
        int current_col = 0;
        int current_row = 0;
        
        int[] ans = new int[rows*cols];
        int ans_pointer = 0;
        
        while (current_row < rows && current_col < cols) {
            
            if (direction_up) {
                
                while (current_row >= 0 && current_col < cols) {
                    ans[ans_pointer] = mat[current_row][current_col];
                    ans_pointer += 1;
                    current_row -= 1;
                    current_col += 1;
                }
                
                if(current_col == cols) {
                    current_row += 2;
                    current_col -= 1;
                }
                else {
                    current_row += 1;
                }
                
                direction_up = false;
                
            }
            else {
                
                while (current_row < rows && current_col >= 0) {
                    ans[ans_pointer] = mat[current_row][current_col];
                    ans_pointer += 1;
                    current_row += 1;
                    current_col -= 1;
                }
                
                if(current_row == rows) {
                    current_col += 2;
                    current_row -= 1;
                }
                else {
                    current_col += 1;
                }
                
                direction_up = true;
                
            }
            
        }
        
        return ans;
        
        
    }
}