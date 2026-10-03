class Solution {
    public int subarraySum(int[] nums, int k) {
        int count =0;
        Map<Integer,Integer> mp =new HashMap<>();
        int[] prefix = new int[nums.length];
        
        for(int i =0;i< nums.length;i++){
            if(i==0){
                prefix[i] = nums[i];
            }else{
                prefix[i]= nums[i]+prefix[i-1]; 
            }
            int z = prefix[i]-k;
            if(mp.containsKey(z)){
                count = count + mp.get(z); 
            }
            if(z ==0){
                count++;
            }
            mp.put(prefix[i],mp.getOrDefault(prefix[i], 0)+1);
        }
        return count;
    }
}