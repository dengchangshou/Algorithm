package algorithm.java.niukewang;

import java.util.LinkedList;
import java.util.Queue;

/*
输入一棵二叉树，求该树的深度。
从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
*/
public class TreeDepth {
    //递归，分治思想
    public static int TreeDepth(TreeNode root) {
        if (root == null) return 0;
        int ldepth = TreeDepth(root.left);
        int rdepth = TreeDepth(root.right);
        return Math.max(ldepth, rdepth) + 1;
    }

    //层次遍历，运用队列
    public static int TreeDepth2(TreeNode root){
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size > 0){
                size--;
                TreeNode curl = queue.poll();
                if(curl.left != null) queue.add(curl.left);
                if(curl.right != null) queue.add(curl.right);
            }
            depth++;
        }
        return depth;
    }
}
