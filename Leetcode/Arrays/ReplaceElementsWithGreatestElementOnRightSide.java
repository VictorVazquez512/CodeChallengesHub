class Solution {
    public int[] replaceElements(int[] arr) {
        int max_right = -1;
        int next_position = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            next_position = arr[i];
            arr[i] = max_right;
            max_right = Math.max(next_position, max_right);
        }
        
        return arr;
        
    }
}