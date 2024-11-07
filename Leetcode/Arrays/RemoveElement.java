class Solution {
    public int removeElement(int[] nums, int val) {
        
        // Use a pointer that track the front of array, it just move when the element of i is valid
        // swap with it and increment the pointer
        int valid_elements_length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[valid_elements_length] = nums[i];
                valid_elements_length += 1;
            }
        }
        
        return valid_elements_length;
        
    }
}