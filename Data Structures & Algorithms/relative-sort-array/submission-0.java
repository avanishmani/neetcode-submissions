class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i =0;i<arr1.length;i++){
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        int[] ans =new int[arr1.length];
        int count =0;
        for(int i =0;i<arr2.length;i++){
            int z = map.get(arr2[i]);
            for(int j=0;j<z;j++){
                ans[count++] = arr2[i];
            }
            map.remove(arr2[i]);
        }
        List<Integer> li = new ArrayList<>();
        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            int key  = mp.getKey();
            int value = mp.getValue();
          while(value>0){
            li.add(key);
            value--;
          }
        }
        Collections.sort(li);
        for(int z =0;z<li.size();z++){
            ans[count++]=li.get(z);
        }
        return ans;
        
    }
}