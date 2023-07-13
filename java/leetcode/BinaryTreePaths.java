package algorithm.java.leetcode;

import algorithm.java.leetcode.vo.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//257. 二叉树的所有路径
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<String> pathQueue = new LinkedList<>();
        nodeQueue.offer(root);
        pathQueue.offer(String.valueOf(root.val));
        while(!nodeQueue.isEmpty()){
            TreeNode node = nodeQueue.poll();
            String path = pathQueue.poll();
            if(node.left == null && node.right == null){
                list.add(path);
            }else {
                if(node.left != null){
                    nodeQueue.offer(node.left);
                    pathQueue.offer(path + "->" + node.left.val);
                }
                if(node.right != null){
                    nodeQueue.offer(node.right);
                    pathQueue.offer(path + "->" + node.right.val);
                }
            }
        }
        return list;
    }
}
