class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int rem = target - numbers[i];
            if(map.containsKey(rem)){
                return new int[]{map.get(rem)+1, i+1};
            }
            map.put(numbers[i],i);
        }
        return new int[] {-1,-1};
    }
}
