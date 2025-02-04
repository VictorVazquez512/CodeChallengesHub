class Solution {
    public int pivotIndex(int[] nums) {
        int total_sum = 0;
        int left_sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            total_sum += nums[i];
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (total_sum - nums[i] - left_sum == left_sum) {
                return i;
            }
            
            left_sum += nums[i];
            
        }
        
        return -1;
        
    }
}