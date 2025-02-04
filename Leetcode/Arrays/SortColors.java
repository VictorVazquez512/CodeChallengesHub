class Solution {
    public void sortColors(int[] nums) {
        int[] ans = mergeSort(nums, 0, nums.length - 1);
    }

    private int[] mergeSort(int[] arr, int l, int r){
        if (l == r) {
            return arr;
        }

        int m = l + (r - l) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
        return arr;
    }

    private int[] merge(int[] arr, int l, int m, int r) {
        int[] left = Arrays.copyOfRange(arr, l, m + 1);
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = l, j = 0, k = 0;

        while (j < left.length && k < right.length) {
            if (left[j] < right[k]) {
                arr[i] = left[j];
                j++;
            } else {
                arr[i] = right[k];
                k++;
            }

            i++;
        }

        while (j < left.length) {
            arr[i] = left[j];
            j++;
            i++;
        }

        while (k < right.length) {
            arr[i] = right[k];
            k++;
            i++;
        }

        return arr;

    }

}