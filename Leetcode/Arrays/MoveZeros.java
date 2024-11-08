class Solution {
    public void moveZeroes(int[] nums) {
        int non_zeros_pointer = 0;
        int temp = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[non_zeros_pointer];
                nums[non_zeros_pointer] = nums[i];
                nums[i] = temp;
                non_zeros_pointer += 1;
            }
        }
        
    }
}