package algorithm.java.leetcode;

//35. 搜索插入位置
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        return searchIndex(nums, 0, nums.length, target);
    }

    //二分查找法，递归
    public int searchIndex(int[] nums, int start, int end, int target){
        int mid = (start + end) / 2;
        if(start == end || nums[mid] == target){
            return mid;
        }else if(target < nums[mid]){
            return searchIndex(nums, start, mid, target);
        }else{
            return searchIndex(nums, mid + 1, end, target);
        }
    }
}
