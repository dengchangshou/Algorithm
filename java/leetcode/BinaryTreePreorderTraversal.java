package algorithm.java.leetcode;

import algorithm.java.leetcode.vo.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//144. 二叉树的前序遍历
public class BinaryTreePreorderTraversal {
    //递归法
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        return preorderTraversal(root, result);
    }

    public List<Integer> preorderTraversal(TreeNode root, List<Integer> list){
        if(root == null){
            return list;
        }
        list.add(root.val);
        preorderTraversal(root.left, list);
        preorderTraversal(root.right, list);
        return list;
    }

    //迭代法
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = new TreeNode();
        stack.push(root);
        while (!stack.empty()){
            node = stack.pop();
            if(node != null){
                result.add(node.val);
                stack.push(node.right);
                stack.push(node.left);
            }
        }
        return result;
    }
}
