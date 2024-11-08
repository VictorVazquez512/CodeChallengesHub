class Solution {
    public int removeDuplicates(int[] nums) {
        int non_duplicates_end = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[non_duplicates_end]) {
                non_duplicates_end++;
                nums[non_duplicates_end] = nums[i];
            }
        }
        
        // Add 1 because we need to return the quantity not the index
        return non_duplicates_end + 1;
    }
}