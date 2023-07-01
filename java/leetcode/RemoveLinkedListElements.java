package algorithm.java.leetcode;

import algorithm.java.leetcode.vo.ListNode;

//203. 移除链表元素
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode();
        newHead.next = head;
        ListNode tmp = newHead;
        while (tmp.next != null){
            if(tmp.next.val == val){
                tmp.next = tmp.next.next;
            }else {
                tmp = tmp.next;
            }
        }
        return newHead.next;
    }
}
