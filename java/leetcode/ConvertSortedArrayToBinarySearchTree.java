package algorithm.java.leetcode;

import algorithm.java.leetcode.vo.TreeNode;

import java.util.LinkedList;
import java.util.Queue;


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

    //迭代法，会超时
    public TreeNode sortedArrayToBST1(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        Queue<TreeNode> treeNodeQueue = new LinkedList<>(); //存放树的结点
        Queue<Integer> leftIndex = new LinkedList<>(); //存放左边界的数组下标
        Queue<Integer> rightIndex = new LinkedList<>(); //存放右边界的数组下标
        TreeNode treeNode = new TreeNode();
        leftIndex.offer(0);
        rightIndex.offer(nums.length - 1);
        treeNodeQueue.offer(treeNode);
        int left, right, mid;
        while(!treeNodeQueue.isEmpty()){
            TreeNode curNode = treeNodeQueue.peek();
            left = leftIndex.peek();
            right = rightIndex.peek();
            mid = left + (right - left) / 2;
            curNode.val = nums[mid];
            if(left < mid){
                treeNodeQueue.offer(new TreeNode());
                leftIndex.offer(left);
                rightIndex.offer(mid - 1);
            }
            if(right > mid){
                treeNodeQueue.offer(new TreeNode());
                leftIndex.offer(mid + 1);
                rightIndex.offer(right);
            }
        }
        return treeNode;
    }
}
