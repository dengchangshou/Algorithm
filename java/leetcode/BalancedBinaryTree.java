package algorithm.java.leetcode;

import algorithm.java.leetcode.vo.TreeNode;

//110. 平衡二叉树
public class BalancedBinaryTree {
    //递归法
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        return treeDepth(root) >= 0;
    }

    private int treeDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftDepth = treeDepth(root.left);
        int rightDepth = treeDepth(root.right);
        if(leftDepth < 0 || rightDepth < 0 || Math.abs(leftDepth - rightDepth) > 1){
            return -1;
        }
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
