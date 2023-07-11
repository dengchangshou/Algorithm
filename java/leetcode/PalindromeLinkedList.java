package algorithm.java.leetcode;

import algorithm.java.leetcode.vo.ListNode;

//234. 回文链表
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        StringBuilder ans = new StringBuilder();
        while (head != null){
            ans.append(head.val);
            head = head.next;
        }
        String s = ans.toString();
        return s.equals(ans.reverse().toString());
    }
}
