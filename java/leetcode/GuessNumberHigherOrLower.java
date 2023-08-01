package algorithm.java.leetcode;

//374. 猜数字大小
public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int low = 0, high = n;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(guess(mid) == 0){
                return mid;
            }else if(guess(mid) < 0){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return low;
    }

    private int guess(int num){
        return num;
    }
}
