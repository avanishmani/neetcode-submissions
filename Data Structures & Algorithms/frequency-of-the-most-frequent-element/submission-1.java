class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long[] pre = new long[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i!=0){
                pre[i]=pre[i-1]+nums[i];
            }else{
                pre[i] =nums[i];
            }
        }
        int le =0;
        int max=1;
         for (int i = 0; i < nums.length; i++) {
            int windowLen = cal(pre, le, i, nums[i], k);

            if (windowLen == -1) {
                le++; 
            } else {
                max = Math.max(max, windowLen); 
            }
        }
        
        return max;

    }
    public static int cal(long[] arr, int l,int r, int t, int k){
      long sum = arr[r] - (l > 0 ? arr[l - 1] : 0);
      long totalNeeded = t * (r - l + 1);
        long diff = totalNeeded - sum;
      if(diff<=k){
        return (r - l + 1);
      }else{
        return -1;
      }
    }
}