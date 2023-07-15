package algorithm.java.leetcode;

//263. 丑数
public class UglyNumber {
    public boolean isUgly(int n) {
        if(n < 1){
            return false;
        }else {
            while (n > 1){
                if(n % 2 == 0){
                    n /= 2;
                }else if(n % 3 == 0){
                    n /= 3;
                }else if(n % 5 == 0){
                    n /= 5;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
