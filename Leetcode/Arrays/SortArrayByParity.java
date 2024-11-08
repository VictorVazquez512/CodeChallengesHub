class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int even_integers_pointer = 0;
        int temp = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                temp = nums[even_integers_pointer];
                nums[even_integers_pointer] = nums[i];
                nums[i] = temp;
                even_integers_pointer += 1;
            }
        }
        
        return nums;
        
    }
}