package algorithm.java.leetcode;

import java.util.HashSet;
import java.util.Set;

//349. 两个数组的交集
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        for(int num : nums2){
            if(set.contains(num)){
                set1.add(num);
            }
        }
        int[] ans = new int[set1.size()];
        int i = 0;
        for(int num : set1){
            ans[i] = num;
            i++;
        }
        return ans;
    }
}
