package algorithm.java.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//1.两数之和
public class TwoSum {

    //hash法
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target-nums[i])){
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);//由于存入两个相同值时只会存入一个key，所以put操作必须放在containsKey后面
        }
        return result;
    }

    //暴力法
    public static int[] twoSum1(int[] nums, int target) {
        int[] numsCopy = new int[nums.length];
        System.arraycopy(nums, 0, numsCopy, 0, nums.length);
        Arrays.sort(nums);
        int[] result = new int[2];
        int small = 0, big = nums.length - 1;
        while(small < big){
            int tempResult = nums[small] + nums[big];
            if(tempResult < target) small++;
            else if(tempResult > target) {
                if(small != 0) small--;
                big--;
            }else break;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[small] == numsCopy[i]){
                result[0] = i;
                break;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(i != result[0] && nums[big] == numsCopy[i]){
                if(result[0] > i){
                    result[1] = result[0];
                    result[0] = i;
                }else
                    result[1] = i;
                break;
            }
        }
        return result;
    }
}
