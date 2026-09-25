class Solution {
    public int[] sortArray(int[] nums) {
        int st =0;
        int end = nums.length-1;
        mergeSort(st,end,nums);
        return nums;
    }
    public static void mergeSort(int left, int right, int[] arr){
        if (left >= right) return; 
        
        int mid = left + (right - left) / 2; 
        
        
        mergeSort(left, mid, arr);
        mergeSort( mid + 1, right,arr);
        merge(arr, left, mid, right);
    }
    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;      
        int j = mid + 1;   
        int k = 0;         
        
        
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        
       
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];
        
        
        for (int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }
    }
}