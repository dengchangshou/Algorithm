package algorithm.java.leetcode;

import java.util.HashMap;
import java.util.Map;

//217. 存在重复元素
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            if(map.containsKey(n)){
                return true;
            }else {
                map.put(n, 1);
            }
        }
        return false;
    }
}
