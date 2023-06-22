package algorithm.java.leetcode;

import algorithm.java.leetcode.vo.ListNode;

import java.util.HashMap;
import java.util.Map;

//141. 环形链表
public class LinkedListCycle {
    //哈希法
    public boolean hasCycle(ListNode head) {
        Map<ListNode, Integer> map = new HashMap();
        while (head != null){
            if(map.containsKey(head)){
                return true;
            }
            map.put(head, head.val);
            head = head.next;
        }
        return false;
    }

    //双指针法，快慢指针
    public boolean hasCycle1(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode fastNode = head.next;
        ListNode lowNode = head;
        while (fastNode != lowNode){
            if(fastNode.next != null && fastNode.next.next != null){
                fastNode = fastNode.next.next;
            }else {
                return false;
            }
            lowNode = lowNode.next;
        }
        return true;
    }

}
