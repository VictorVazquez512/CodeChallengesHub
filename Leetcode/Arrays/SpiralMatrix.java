class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList();
        
        if (matrix.length == 0) return ans;
        
        int top_lim = 0;
        int bottom_lim = matrix.length - 1;
        int left_lim = 0;
        int right_lim = matrix[0].length - 1;
        
        while (top_lim <= bottom_lim && left_lim <= right_lim) {
            
            for (int i = left_lim; i <= right_lim; i++) {
                ans.add(matrix[top_lim][i]);
            }
            
            top_lim += 1;
            
            for (int i = top_lim; i <= bottom_lim; i++) {
                ans.add(matrix[i][right_lim]);
            }
            
            right_lim -= 1;
            
            if (top_lim <= bottom_lim) {
                for (int i = right_lim; i >= left_lim; i--) {
                    ans.add(matrix[bottom_lim][i]);
                }
            }
            
            bottom_lim -= 1;
            
            if (left_lim  <= right_lim) {
                for (int i = bottom_lim; i >= top_lim; i--) {
                    ans.add(matrix[i][left_lim]);
                }
            }
            
            left_lim += 1;
            
        }
        
        return ans;
        
    }
}