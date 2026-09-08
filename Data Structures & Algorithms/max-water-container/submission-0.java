class Solution {
    public int maxArea(int[] heights) {
        int left =0;
        int right =heights.length-1;
        int max =Integer.MIN_VALUE;
        while(left<right){
            int h1= heights[left];
            int h2= heights[right];
            max = Math.max((Math.min(h1,h2)*(right-left)), max);
            if(h1<h2){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
