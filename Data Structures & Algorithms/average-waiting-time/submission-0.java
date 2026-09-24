class Solution {
    public double averageWaitingTime(int[][] customers) {
        double sum =0;
        double cum =0;
        for(int i =0;i<customers.length;i++){
            int st = customers[i][0];
            int end = customers[i][1];
            if(i==0){
                sum = st+end;
            }else{
               
                sum = (sum> st)? sum+end: st+end;
            }
            
            cum +=sum-st;
            System.out.println("Sum at index "+ i + " is "+ sum +", cumulative sum "+ cum);
        }

        return (cum/customers.length);
    }
}