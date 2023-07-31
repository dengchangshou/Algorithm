package algorithm.java.leetcode;

//367. 有效的完全平方数
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if(num == 0){
            return true;
        }
        int left = 1, right = num, mid;
        while (left <= right){
            mid = left + (right - left) / 2;
            if(num / mid == mid){
                return num % mid == 0;
            }else {
                if(num / mid > mid){
                    left = mid + 1;
                }else if(num / mid < mid){
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
