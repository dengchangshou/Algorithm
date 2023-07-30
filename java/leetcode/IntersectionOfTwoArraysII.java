package algorithm.java.leetcode;

import java.util.*;

//350. 两个数组的交集II
public class IntersectionOfTwoArraysII {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for(int num : nums1){
            if(map1.containsKey(num)){
                map1.put(num, map1.get(num) + 1);
            }else {
                map1.put(num, 1);
            }
        }
        for(int num : nums2){
            if(map2.containsKey(num)){
                map2.put(num, map2.get(num) + 1);
            }else {
                map2.put(num, 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> map : map1.entrySet()){
            if(map2.containsKey(map.getKey())){
                int n = Math.min(map.getValue(), map2.get(map.getKey()));
                while (n > 0){
                    list.add(map.getKey());
                    n--;
                }
            }
        }
        int[] ans = new int[list.size()];
        int i = 0;
        for(int num : list){
            ans[i] = num;
            i++;
        }
        return ans;
    }
}
