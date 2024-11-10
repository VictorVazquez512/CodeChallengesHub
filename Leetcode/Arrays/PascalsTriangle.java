class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<>();
        
        if (numRows == 0) return triangle;
        
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);
        
        for (int i = 1; i < numRows; i++) {
            List<Integer> previousRow = triangle.get(i-1);
            List<Integer> newRow = new ArrayList<>();
            
            newRow.add(1);
            
            for (int j = 1; j < i; j++) {
                newRow.add(previousRow.get(j-1) + previousRow.get(j));
            }
            
            newRow.add(1);
            triangle.add(newRow);
            
        }
        
        return triangle;
        
    }
}