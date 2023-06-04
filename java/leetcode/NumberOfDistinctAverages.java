package algorithm.java.leetcode;

import java.util.*;

//2465. 不同的平均值数目
public class NumberOfDistinctAverages {
    public int distinctAverages(int[] nums) {
        Set<Integer> result = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0, j = nums.length - 1; i < j; i++, j--){
            result.add(nums[i] + nums[j]);
        }
        return result.size();
    }
}
