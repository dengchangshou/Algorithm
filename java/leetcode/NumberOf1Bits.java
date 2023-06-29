package algorithm.java.leetcode;

//191. 位1的个数
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int number = 0;
        for(int i = 0; i < 32; i++){
            if((n & (1 << i)) != 0){
                number++;
            }
        }
        return number;
    }
}
