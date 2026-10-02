class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mp1 =new HashMap<>();
        Map<Integer,Integer> mp2 =new HashMap<>();
        List<List<Integer>> result =new ArrayList<>();
        for(int i =0;i< nums1.length;i++){
            mp1.put(nums1[i],mp1.getOrDefault(nums1[i],0)+1);
        }
        for(int i =0;i< nums2.length;i++){
            mp2.put(nums2[i],mp2.getOrDefault(nums2[i],0)+1);
        }
        List<Integer> li1 =new ArrayList<>();
        List<Integer> li2 =new ArrayList<>();
        for(int i =0;i< nums1.length;i++){
            int z = mp2.getOrDefault(nums1[i],0);
            if(z==0){
                li1.add(nums1[i]);
            }
        }
        result.add(li1.stream().distinct().collect(Collectors.toList()));
        for(int i =0;i< nums2.length;i++){
            int z = mp1.getOrDefault(nums2[i],0);
            if(z==0){
                li2.add(nums2[i]);
            }
        }
        ;
        result.add(li2.stream().distinct().collect(Collectors.toList()));
        return result;
    }
}