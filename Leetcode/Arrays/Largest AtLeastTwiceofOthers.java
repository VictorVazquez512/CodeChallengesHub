class Solution {
    public int dominantIndex(int[] nums) {
        int max_index = 0;
        int max = -1;
        int second_max = -1;
        
        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] > max) {
                second_max = max;
                max = nums[i];
                max_index = i;
            } 
            else if (nums[i] > second_max) {
                second_max = nums[i];
            }
            
        }
        
        if (second_max == -1) return max;
        
        if (max >= (second_max * 2)) {           
            return max_index;
        }
        
        return -1;
        
    }
}