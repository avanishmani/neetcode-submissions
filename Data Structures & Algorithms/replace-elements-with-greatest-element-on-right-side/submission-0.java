class Solution {
    public int[] replaceElements(int[] arr) {
        
        int i= arr.length-1;
        int max=arr[i];
        while(i>=0){
            int temp= (i==arr.length-1 ?  arr[i] : max> arr[i]? max : arr[i]);
            arr[i]= i==arr.length-1 ? -1 : max;
            System.out.println("value i : " +i+ " , and the value of max is :"+ (i==arr.length-1 ? -1 : max));
            max= temp>max? temp : max; 
            
            i--;
        }
        return arr;
    }
}