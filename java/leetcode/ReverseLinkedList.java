package algorithm.java.leetcode;

import algorithm.java.leetcode.vo.ListNode;

import java.util.Stack;

//206. 反转链表
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        while(head != null){
            stack.push(head);
            head = head.next;
            stack.peek().next = null;
        }
        ListNode newHead = stack.pop();
        newHead.next = null;
        ListNode tmp = newHead;
        while (!stack.empty()){
            tmp.next = stack.pop();
            tmp = tmp.next;
        }
        return newHead;
    }

    //优化
    public ListNode reverseList1(ListNode head) {
        ListNode pre = null, next = null;
        ListNode cur = head;
        while (cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

}
