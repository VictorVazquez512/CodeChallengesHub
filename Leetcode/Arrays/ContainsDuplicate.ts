// Sorting Approach (less space complexity, more time complexity)
function containsDuplicate(nums: number[]): boolean {
  nums.sort((a, b) => a - b);

  for (let i = 0; i < nums.length; i++) {
    if (nums[i] == nums[i - 1]) {
      return true;
    }
  }

  return false;
}

// Hash Table Approach (more space complexity, less time complexity)
function containsDuplicate(nums: number[]): boolean {
  const numsSet: Set<number> = new Set<number>();

  for (let i = 0; i < nums.length; i++) {
    if (numsSet.has(nums[i])) {
      return true;
    }
    numsSet.add(nums[i]);
  }

  return false;
}
