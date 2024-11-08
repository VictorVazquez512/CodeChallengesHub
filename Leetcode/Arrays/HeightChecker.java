class Solution {
    public int heightChecker(int[] heights) {
        int[] height_freq = new int[101];
        int ans = 0;
        
        for (int i = 0; i < heights.length; i++) height_freq[heights[i]]++;
        
        int freq_pointer = 0;
        for (int i = 0; i < heights.length; i++) {
            while(height_freq[freq_pointer] == 0) freq_pointer += 1;
            
            if (freq_pointer != heights[i]) ans += 1;
            
            height_freq[freq_pointer] -= 1;
            
        }
        
        return ans;
        
    }
}