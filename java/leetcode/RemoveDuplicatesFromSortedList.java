package algorithm.java.leetcode;

import algorithm.java.leetcode.vo.ListNode;

//83. 删除排序链表中的重复元素
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode pre = head;
        while(pre.next != null){
            if(pre.val == pre.next.val){
                pre.next = pre.next.next;
            }else {
                pre = pre.next;
            }
        }
        return head;
    }

}


