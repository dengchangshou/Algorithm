package algorithm.java.leetcode;

import algorithm.java.leetcode.vo.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

//226. 翻转二叉树
public class InvertBinaryTree {
    //递归法
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    //迭代法
    public TreeNode invertTree1(TreeNode root) {
        if(root == null){
            return root;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            if(treeNode != null){
                TreeNode tmp = treeNode.left;
                treeNode.left = treeNode.right;
                treeNode.right = tmp;
            }
            if(treeNode.left != null){
                queue.offer(treeNode.left);
            }
            if(treeNode.right != null){
                queue.offer(treeNode.right);
            }
        }
        return root;
    }
}
