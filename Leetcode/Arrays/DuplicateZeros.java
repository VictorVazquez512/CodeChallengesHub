class Solution {
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println(i+1);
                insertElement(arr, i+1, 0);
                i++;
            }
        }
    }
    
    private void insertElement(int[] arr, int index, int new_element) {
        if (index > arr.length - 1) return;
        
        // Shift elements to the right to create space
        int counter = arr.length - 1;
        while (counter > index) {
                arr[counter] = arr[counter-1];
                counter--;
            }
        
        // Put the element in the index
        arr[index] = new_element;
        
        }
    
}