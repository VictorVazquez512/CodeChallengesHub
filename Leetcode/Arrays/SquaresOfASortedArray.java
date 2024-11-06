class Solution {
    public int[] sortedSquares(int[] nums) {
        int negative_pointer = 0;
        int positive_pointer = nums.length - 1;
        int[] squared_array = new int[nums.length];
        int pointer_squared_array = nums.length - 1;
        
        while (negative_pointer <= positive_pointer) {
            if (nums[negative_pointer]*nums[negative_pointer] > nums[positive_pointer]*nums[positive_pointer]) {
                squared_array[pointer_squared_array] = nums[negative_pointer]*nums[negative_pointer];
                negative_pointer += 1;
                pointer_squared_array -= 1;
            }
            else {
                squared_array[pointer_squared_array] = nums[positive_pointer]*nums[positive_pointer];
                positive_pointer -= 1;
                pointer_squared_array -= 1;
            }
            
        }
        
        return squared_array;
        
    }
}