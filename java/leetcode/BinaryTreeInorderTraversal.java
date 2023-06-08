package algorithm.java.leetcode;

import algorithm.java.leetcode.vo.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//94. 二叉树的中序遍历
public class BinaryTreeInorderTraversal {
    //递归法
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    //迭代法
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.empty()) {
            //先找左结点
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            //中间结点加入列表
            list.add(root.val);
            //再找右结点
            root = root.right;
        }
        return list;
    }

    //Morris 中序遍历
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode pre = null, tmp = null;
        while (root != null) {
            if (root.left != null) {
                pre = root.left;
                //查找root左子树的最右子树
                while (pre.right != null) {
                    pre = pre.right;
                }
                //右结点为空，将root的右子树全部连接到该右结点
                pre.right = root;
                //暂存根结点
                tmp = root;
                //root指向左结点
                root = root.left;
                //原root结点的左结点设为空
                tmp.left = null;
            }else {
                //右子树为空，则打印结点，并向右遍历
                list.add(root.val);
                root = root.right;
            }
        }
        return list;
    }
}
