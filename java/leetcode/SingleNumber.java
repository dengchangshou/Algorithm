package algorithm.java.leetcode;

//136. 只出现一次的数字
//要求时间复杂度O(n)，空间复杂度O(1)
public class SingleNumber {
    public int singleNumber(int[] nums) {
        //根据题目要求只能使用位运算
        int result = 0;
        for(int num : nums){
            result ^= num;
        }
        return result;
    }
}
