package algorithm.java.leetcode;

import algorithm.java.leetcode.vo.ListNode;

import java.util.HashMap;
import java.util.Map;

//160. 相交链表
public class IntersectionOfTwoLinkedLists {
    //暴力破解法
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while (headA != null) {
            ListNode temp = headB;
            while (temp != null) {
                if (headA.next == temp) {
                    return temp;
                } else if (headA == temp.next) {
                    return headA;
                } else if (headA == temp) {
                    return temp;
                }
                temp = temp.next;
            }
            headA = headA.next;
        }
        return null;
    }

    //哈希法
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        Map<ListNode, Integer> map = new HashMap<>();
        ListNode tempA = headA;
        while (tempA != null){
            map.put(tempA, tempA.val);
            tempA = tempA.next;
        }
        ListNode tempB = headB;
        while (tempB != null){
            if (map.containsKey(tempB)){
                return tempB;
            }
            tempB = tempB.next;
        }
        return null;
    }

    //双指针法
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB){
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }

}
