class Solution {
    public int singleNonDuplicate(int[] nums) {
       int i =1;
       int n =nums.length-1;
       if(n==0){
        return nums[0];
       }
       if(nums[0]!=nums[i]){
        return nums[0];
       }
       if(nums[n]!=nums[n-1]){
        return nums[n];
       }
       int j =n-1;
       while(i<=j) {
        int mid =i+(j-i)/2;
        if(mid%2==0 && mid!=0){
            if(nums[mid-1]==nums[mid]){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }else{
            if(nums[mid-1]==nums[mid]){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
       }
       return nums[j];
    }
}