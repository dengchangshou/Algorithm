package algorithm.java.leetcode;

import algorithm.java.leetcode.vo.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//145. 二叉树的后序遍历
public class BinaryTreePostorderTraversal {
    //递归法
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return postorderTraversal(root, list);
    }

    public List<Integer> postorderTraversal(TreeNode root, List<Integer> list) {
        if(root == null){
            return list;
        }
        postorderTraversal(root.left, list);
        postorderTraversal(root.right, list);
        list.add(root.val);
        return list;
    }

    //迭代法
    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = new TreeNode();
        while (root != null || !stack.empty()) {
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(root.right == null || pre == root.right){
                list.add(root.val);
                pre = root;
                root = null;
            }else {
                stack.push(root);
                root = root.right;
            }
        }
        return list;
    }

}
