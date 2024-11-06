class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current_consecutive = 0;
        int max_consecutive = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                current_consecutive++;
                if (current_consecutive > max_consecutive) {
                    max_consecutive = current_consecutive;
                }
            }
            else {
                current_consecutive = 0;
            }
        }
        
        return max_consecutive;
        
    }
}