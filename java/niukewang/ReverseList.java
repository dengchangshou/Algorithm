package algorithm.java.niukewang;

import java.util.ArrayList;

//输入一个链表，反转链表后，输出新链表的表头。
public class ReverseList {

    //空间复杂度O(n)
    public ListNode ReverseList1(ListNode head){
        if(head == null)
            return null;
        ArrayList<ListNode> arrayList = new ArrayList<>();
        arrayList.add(head);
        while(head.next != null){
            head = head.next;
            arrayList.add(head);
        }
        int len = arrayList.size();
        ListNode newHead = arrayList.get(len-1);
        ListNode temp = newHead;
        for(int j = len - 1; j > 0; j--){
            temp.next = arrayList.get(j - 1);
            temp = temp.next;
        }
        temp.next = null;
        return newHead;
    }

    //优化
    public ListNode ReverseList2(ListNode head){
        ListNode pre = null; //反转后链表的最后一个结点
        ListNode cur = head; //反转前链表的第一个节点
        ListNode nex = null; //反转前链表的第二个结点
        while(cur != null) {
            nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
        }
        return pre;
    }
}
