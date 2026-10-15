/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
     int st = 1;
        int end = n;

        while (st <= end) {
            // Integer overflow se bachne ke liye
            int mid = st + (end - st) / 2;
            int result = guess(mid);

            if (result == 0) {
                return mid; // Number mil gaya!
            } else if (result == -1) {
                end = mid - 1; // Guess target se bada hai, range choti karo
            } else {
                st = mid + 1;  // Guess target se chota hai, range badi karo
            }
        }

        return -1;  
    }
}