package algorithm.java.leetcode;

// 172.阶乘后的零
public class FactorialTrailingZeroes {
    public static int trailingZeroes(int n) {
        int result = 0;
        while (n > 0){
            n /= 5;
            result += n;
        }
        return result;
    }
}
/*
思路：找n中5的公倍数，5^2的公倍数，以此类推，直到5^x > n为止
result = n/5 + n/(5^2) + n/(5^3) + ......
 */