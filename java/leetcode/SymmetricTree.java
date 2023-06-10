package algorithm.java.leetcode;

import algorithm.java.leetcode.vo.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

//101. 对称二叉树
public class SymmetricTree {

    //递归法
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }else {
            return isSymmetric(root.left, root.right);
        }
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null){
            return true;
        }else if(left == null || right == null || left.val != right.val){
            return false;
        }
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }

    //迭代法
    public boolean isSymmetric1(TreeNode root) {
        if(root == null){
            return true;
        }else {
            return isSymmetric(root, root);
        }
    }

    private boolean isSymmetric1(TreeNode left, TreeNode right) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(left);
        queue.offer(right);
        while(!queue.isEmpty()){
            left = queue.poll();
            right = queue.poll();
            if(left == null && right == null){
                continue;
            }else if(left == null || right == null || left.val != right.val){
                return false;
            }
            queue.offer(left.left);
            queue.offer(right.right);
            queue.offer(left.right);
            queue.offer(right.left);
        }
        return true;
    }
}
