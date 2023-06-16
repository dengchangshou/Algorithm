package algorithm.java.leetcode;

import algorithm.java.leetcode.vo.TreeNode;

//112. 路径总和
public class PathSum {

    //递归法1
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return treeSum(root, 0, targetSum);
    }

    private boolean treeSum(TreeNode root, int currentSum, int targetSum){
        if(root == null){
            return false;
        }
        currentSum += root.val;
        if(root.left == null && root.right == null && currentSum == targetSum){
            return true;
        }
        return treeSum(root.right, currentSum, targetSum) || treeSum(root.left, currentSum, targetSum);
    }

    //递归法2
    public boolean hasPathSum1(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        if(root.left != null && root.right != null){
            return root.val == targetSum;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
