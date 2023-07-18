package algorithm.java.leetcode;

//283. 移动零
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int tmp = 0;
        boolean zero = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0 && !zero){
                tmp = i;
                zero = true;
            }else if(nums[i] != 0 && zero){
                nums[tmp] = nums[i];
                nums[i] = 0;
                i = tmp;
                zero = false;
            }
        }
    }
}
