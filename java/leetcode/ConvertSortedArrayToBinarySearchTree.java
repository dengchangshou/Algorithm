package algorithm.java.leetcode;

import algorithm.java.leetcode.vo.TreeNode;


//108. 将有序数组转换为二叉搜索树
public class ConvertSortedArrayToBinarySearchTree {

    //递归法
    public TreeNode sortedArrayToBST(int[] nums) {
        return createTree(nums, 0, nums.length - 1);
    }

    private TreeNode createTree(int[] nums, int start, int end){
        if (start <= end){
            TreeNode treeNode = new TreeNode();
//          int mid = (start + end) / 2;  //优化取中间值计算方法
            int mid = start + (end - start) / 2; //防止 start + end 溢出
            treeNode.val = nums[mid];
            treeNode.left = createTree(nums, start, mid - 1);
            treeNode.right = createTree(nums, mid + 1, end);
            return treeNode;
        }
        return null;
    }

}
