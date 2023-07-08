package algorithm.java.leetcode;

import java.util.ArrayList;
import java.util.List;

//228. 汇总区间
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length == 0){
            return list;
        }
        StringBuilder s = new StringBuilder();
        s.append(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1] + 1){
                if(!s.toString().equals(String.valueOf(nums[i - 1]))){
                    s.append("->").append(nums[i - 1]);
                }
                list.add(s.toString());
                s = new StringBuilder();
                s.append(nums[i]);
            }else if(i == nums.length - 1){
                s.append("->").append(nums[i]);
            }
        }
        list.add(s.toString());
        return list;
    }
}
