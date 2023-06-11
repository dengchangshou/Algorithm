package algorithm.java.leetcode;

import algorithm.java.leetcode.vo.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

//104. 二叉树的最大深度
public class MaximumDepthOfBinaryTree {

    //递归法
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else if(root.left == null && root.right == null){
            return 1;
        }else{
            int left = maxDepth(root.left) + 1;
            int right = maxDepth(root.right) + 1;
            return Math.max(left, right);
        }
    }

    //迭代法
    public int maxDepth1(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0, size = 0;
        while(!queue.isEmpty()){
            size = queue.size();
            while(size > 0){
                root = queue.poll();
                if(root != null){
                    queue.offer(root.left);
                    queue.offer(root.right);
                }
                size--;
            }
            depth++;
        }
        return depth - 1; //因为将叶子结点的下一层也算入在内，所以需要-1.

        /* 不需要 -1 的算法
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0, size = 0;
        while(!queue.isEmpty()){
            size = queue.size();
            while(size > 0){
                root = queue.poll();
                if(root.left != null) {
                    queue.offer(root.left);
                }
                if(root.right != null){
                    queue.offer(root.right);
                }
                size--;
            }
            depth++;
        }
        return depth;
        */
    }



}
