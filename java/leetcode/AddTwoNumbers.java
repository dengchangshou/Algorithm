package algorithm.java.leetcode;
//2.两数相加
public class AddTwoNumbers {
    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    //自解
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode p = result;
        int sum = 0;
        boolean carry = false;
        while (l1 != null && l2 != null) {
            sum = 0;
            if (carry) {
                sum = 1;
                carry = false;
            }
            sum += l1.val + l2.val;
            if (sum >= 10) {
                carry = true;
                sum %= 10;
            }
            p.val = sum;
            if (l1.next == null && l2.next == null && !carry) {
                return result;
            }
            p.next = new ListNode();
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            sum = 0;
            if (carry) {
                sum = 1;
                carry = false;
            }
            sum += l1.val;
            if (sum >= 10) {
                carry = true;
                sum %= 10;
            }
            p.val = sum;
            if (l1.next == null && !carry) {
                return result;
            }
            p.next = new ListNode();
            p = p.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            sum = 0;
            if (carry) {
                sum = 1;
                carry = false;
            }
            sum += l2.val;
            if (sum >= 10) {
                carry = true;
                sum %= 10;
            }
            p.val = sum;
            if (l2.next == null && !carry) {
                return result;
            }
            p.next = new ListNode();
            p = p.next;
            l2 = l2.next;
        }
        if (carry) {
            p.val = 1;
        }
        return result;
    }

    //优化
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        int n1, n2, sum;
        while (l1 != null || l2 != null) {
            n1 = l1 != null ? l1.val : 0;
            n2 = l2 != null ? l2.val : 0;
            sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }
}


