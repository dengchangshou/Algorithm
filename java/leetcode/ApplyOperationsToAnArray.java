package algorithm.java.leetcode;

//2460. 对数组执行操作
public class ApplyOperationsToAnArray {
    public int[] applyOperations(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                nums[i] += nums[i];
                nums[i + 1] = 0;
            }
        }
        for(int i = 0, j = 1; j < nums.length; j++){
            if(nums[i] != 0){
                i++;
                continue;
            }
            if(nums[j] != 0){
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
            }
        }
        return nums;
    }
}
