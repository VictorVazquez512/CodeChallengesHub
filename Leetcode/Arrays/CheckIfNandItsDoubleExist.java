class Solution {
    public boolean checkIfExist(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            k = search(arr, arr[i]*2);
            if (k >= 0 && k != i) {
                return true;
            }
        }
        
        return false;
        
    }
    
    private int search(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return -1;
    }
    
}