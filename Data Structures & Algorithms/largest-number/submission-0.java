class Solution {
    public String largestNumber(int[] nums) {
    //     // Arrays.sort(nums,(a, b) -> Integer.compare(b, a));
    //   StringBuilder sb =new StringBuilder();
    //   for(int i=0;i<nums.length;i++){
    //     sb.append(nums[i]);
    //   }  
    // //   String[] result= 
    //   return sb.toString().split("");
   
    // // FIX 1: Use Integer[] (wrapper class) instead of int[] (primitive)
    //   Integer[] arr = new Integer[result.length];
    //   for(int i = 0; i < result.length; i++){
    //     arr[i] = Integer.parseInt(result[i]);
    //   }
      
    //   // FIX 2: Now Arrays.sort with a custom comparator compiles cleanly
    //   Arrays.sort(arr, (a, b) -> Integer.compare(b, a));
      
    //   StringBuilder s = new StringBuilder();
    //   for(int i = 0; i < arr.length; i++){
    //     s.append(arr[i]);
    //   }
      
    //   return s.toString();
    List<String> arr = new ArrayList<>();
        for (int num : nums) {
            arr.add(String.valueOf(num));
        }

        StringBuilder res = new StringBuilder();
        while (!arr.isEmpty()) {
            int maxi = 0;
            for (int i = 1; i < arr.size(); i++) {
                if ((arr.get(i) + arr.get(maxi)).compareTo(arr.get(maxi) + arr.get(i)) > 0) {
                    maxi = i;
                }
            }
            res.append(arr.get(maxi));
            arr.remove(maxi);
        }

        String result = res.toString();
        return result.charAt(0) == '0' ? "0" : result;
    }
}