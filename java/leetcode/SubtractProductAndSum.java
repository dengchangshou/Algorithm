package algorithm.java.leetcode;

//1281. 整数的各位积和之差
public class SubtractProductAndSum {
    public int subtractProductAndSum(int n) {
        int addSum = 0, mulSum = 1;
        while (n > 0){
            int tmp = n % 10;
            addSum += tmp;
            mulSum *= tmp;
            n /= 10;
        }
        return mulSum - addSum;
    }
}
