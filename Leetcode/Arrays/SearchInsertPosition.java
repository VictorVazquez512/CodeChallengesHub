class Solution {
    public int searchInsert(int[] nums, int target) {
        int left_pointer = 0;
        int right_pointer = nums.length - 1;
        int mid;

        while (left_pointer <= right_pointer) {
            mid = left_pointer + (right_pointer - left_pointer) / 2;

            if (nums[mid] > target) {
                right_pointer = mid - 1;
            } else if (nums[mid] < target) {
                left_pointer = mid + 1;
            } else {
                return mid;
            }
        }

        return left_pointer;
    }
}