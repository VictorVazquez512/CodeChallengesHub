class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1;
        
        // Merge the arrays in reverse order
        while (m > 0 && n > 0) {
            if (nums2[n-1] > nums1[m-1]) {
                nums1[last] = nums2[n-1];
                n--;
            } else {
                nums1[last] = nums1[m-1];
                m--;
            }
            last--;
        }
        
        // Fill nums1 with the rest of the numbers if there are
        while (n > 0) {
            nums1[last] = nums2[n-1];
            last--;
            n--;
        }
        
    }
}