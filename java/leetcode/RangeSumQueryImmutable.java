package algorithm.java.leetcode;

//303. 区域和检索 - 数组不可变
public class RangeSumQueryImmutable {
    int sums[];
    public RangeSumQueryImmutable(int[] nums) {
        int len = nums.length;
        sums = new int[len + 1];
        for(int i = 0; i < len; i++){
            sums[i + 1] = sums[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return sums[right + 1] - sums[left];
    }
}
