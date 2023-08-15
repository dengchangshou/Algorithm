package algorithm.java.leetcode;

//912. 排序数组
public class SortArray {
    //堆排序
    public int[] sortArray(int[] nums) {
        int len = nums.length;
        //将数组整理成堆（部分有序）
        heapify(nums);
        //循环不变量：区间[0, i]堆有序
        for(int i = len - 1; i >= 1; ){
            //把堆顶元素（当前最大）交换到数组末尾
            swap(nums, 0, i);
            //逐步减少堆有序部分
            i--;
            //下标0位置下沉操作，使得区间[0,i]堆有序
            siftDown(nums, 0, i);
        }
        return nums;
    }

    /**
     * 将数组整理成堆（堆有序）
     *
     * @param nums
     */
    private void heapify(int[] nums) {
        int len = nums.length;
        // 只需要从 i = (len - 1) / 2 这个位置开始逐层下移
        for(int i = (len - 1)/2; i >= 0; i--){
            siftDown(nums, i, len - 1);
        }
    }

    /**
     * @param nums
     * @param k    当前下沉元素的下标
     * @param end  [0, end] 是 nums 的有效部分
     */
    private void siftDown(int[] nums, int k, int end) {
        while(2*k+1 <= end){
            int j = 2*k+1;
            if(j + 1 <= end && nums[j+1] > nums[j]){
                j++;
            }
            if(nums[j] > nums[k]) {
                swap(nums, j, k);
            }else {
                break;
            }
            k = j;
        }
    }

    private void swap(int[] nums, int j, int k) {
        int tmp = nums[j];
        nums[j] = nums[k];
        nums[k] = tmp;
    }
}
