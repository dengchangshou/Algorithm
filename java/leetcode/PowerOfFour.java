package algorithm.java.leetcode;

//342. 4的幂
public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if(n <= 0){
            return false;
        }
        while (n > 1){
            if(n % 4 == 0){
                n /= 4;
            }else {
                return false;
            }
        }
        return true;
    }
}
