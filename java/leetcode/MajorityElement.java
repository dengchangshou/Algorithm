package algorithm.java.leetcode;

import java.util.HashMap;
import java.util.Map;

//169. 多数元素
public class MajorityElement {

    //哈希法
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        int times = 0, max = 0;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() > times) {
                times = m.getValue();
                max = m.getKey();
            }
        }
        return max;
    }

    //摩尔投票法
    public int majorityElement1(int[] nums) {
        int ans = nums[0];
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == ans){
                count++;
            }else{
                if(count == 0){
                    ans = nums[i];
                    count++;
                }else {
                    count--;
                }
            }
        }
        return ans;
    }
}

