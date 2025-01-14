class Solution {
    public int search(int[] nums, int target) {
        int left_pointer = 0;
        int right_pointer = nums.length - 1;
        int middle;

        while (left_pointer <= right_pointer) {
            middle = (left_pointer + right_pointer) / 2;
            if (nums[middle] > target) {
                right_pointer = middle - 1;
            } else if (nums[middle] < target) {
                left_pointer = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}