// Sorting Approach (less space complexity, more time complexity)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                return true;
            }
        }

        return false;

    }
}

// Hash Set Approach (less time complexity, more space complexity)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (numsSet.contains(nums[i])) {
                return true;
            }
            numsSet.add(nums[i]);
        }

        return false;

    }
}

// Typescript version of Hash Set Approach
function containsDuplicate(nums: number[]): boolean {
    const numsSet = new Set<number>();

    for (let i = 0; i < nums.length; i++) {
        if (numsSet.has(nums[i])) {
            return true;
        }
        numsSet.add(nums[i]);
    }

    return false;

}