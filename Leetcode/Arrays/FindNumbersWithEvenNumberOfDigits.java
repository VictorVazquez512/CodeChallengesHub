class Solution {
    public int findNumbers(int[] nums) {
        int count_nums_even_digits = 0;
        for (int num:nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                count_nums_even_digits++;
            }
        }
        return count_nums_even_digits;
    }
}