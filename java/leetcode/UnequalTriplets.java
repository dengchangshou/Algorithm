package algorithm.java.leetcode;

import java.util.Arrays;
import java.util.HashMap;

//2475. 数组中不等三元组的数目
public class UnequalTriplets {
    //枚举法
    public int unequalTriplets(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(nums[i] != nums[j] && nums[j] != nums[k] && nums[k] != nums[i]){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    //排序法
    public int unequalTriplets1(int[] nums){
        int n = nums.length;
        if(n < 3){
            return 0;
        }
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0, j = 0; i < n; i = j){
            while(j < n && nums[i] == nums[j]){
                j++;
            }
            ans += i * (j - i) * (n - j);
        }
        return ans;
    }

    //哈希法
    public int unequalTriplets2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.get(num) == null){
                map.put(num, 1);
            }else {
                map.put(num, map.get(num) + 1);
            }
        }
        int size = map.size();
        if (size < 3){
            return 0;
        }else {
            int ans = 0, n = nums.length, t = 0;
            for(int value : map.values()){
                ans += t * value * (n - t - value);
                t += value;
            }
            return ans;
        }
    }

}
