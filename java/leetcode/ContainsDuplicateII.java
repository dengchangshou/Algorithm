package algorithm.java.leetcode;

import java.util.HashMap;
import java.util.Map;

//219. 存在重复元素 II
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length < 2){
            return false;
        }
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length && j <= i + k; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    //哈希法
    public boolean containsNearbyDuplicate1(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for(int i = 0; i < len; i++){
            int num = nums[i];
            if (map.containsKey(num) && (i - map.get(num) <= k)){
                return true;
            }
            map.put(num, i);
        }
        return false;
    }

}
