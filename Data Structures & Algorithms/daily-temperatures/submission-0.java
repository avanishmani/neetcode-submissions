class Solution {
    public int[] dailyTemperatures(int[] temp) {
       int n = temp.length;
        int[] res = new int[n];

        for (int i = n - 2; i >= 0; i--) {
            int j = i + 1;

            while (j < n && temp[j] <= temp[i]) {
                if (res[j] == 0) {
                    j = n; // no warmer day
                } else {
                    j = j + res[j]; // jump ahead
                }
            }

            if (j < n) {
                res[i] = j - i;
            }
        }
        return res;
    }
}
