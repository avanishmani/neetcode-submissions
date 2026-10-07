class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]-1)){
                continue;
                
            }else{
               int count =1;
               int j=1;
               while(set.contains(nums[i]+j)){
                j++;
                count++;
               }
               l=Math.max(l,count);
            }
            
        }
        return l;
    }
}
