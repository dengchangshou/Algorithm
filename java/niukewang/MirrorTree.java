package algorithm.java.niukewang;

import java.util.LinkedList;
import java.util.Queue;

//二叉树镜像交换
public class MirrorTree {

    //递归
    public static void Mirror(TreeNode root) {
    if(root == null) return;
    TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;
    Mirror(root.left);
    Mirror(root.right);
    }


    //非递归
    public void Mirror2(TreeNode root) {
        if(root == null) return;
        Queue<TreeNode> nodes = new LinkedList<>();
        TreeNode curr, temp;
        nodes.offer(root);
        while(!nodes.isEmpty()){
            curr = nodes.poll();
            temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;
            if(curr.left != null) nodes.offer(curr.left);
            if(curr.right != null) nodes.offer(curr.right);
        }
    }

}





