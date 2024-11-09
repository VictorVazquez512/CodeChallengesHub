class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int index = 0;
        
        for (int i = 0; i < nums.length; i++) {
            index = Math.abs(nums[i]) - 1;
            nums[index] = -Math.abs(nums[index]);
        }
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        
        LinkedList<Integer> ans = new LinkedList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans.add(i+1);
            }
        }
        
        return ans;
        
    }
}