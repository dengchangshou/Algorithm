package algorithm.java.leetcode;

import algorithm.java.leetcode.vo.TreeNode;

//111. 二叉树的最小深度
public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }else if(root.left == null){
            return minDepth(root.right) + 1;
        }else if(root.right == null){
            return minDepth(root.left) + 1;
        }else {
            return Math.min(minDepth(root.right) + 1, minDepth(root.left) + 1);
        }
    }
}
