package algorithm.java.leetcode;

//21. 合并两个有序链表
public class MergeTwoSortedLists {

    //添加新链表整合两条链表
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = new ListNode();
        ListNode tmpList = newList;
        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                tmpList.next = list2;
                list2 = list2.next;
            }else {
                tmpList.next = list1;
                list1 = list1.next;
            }
            tmpList = tmpList.next;
        }
        if (list1 == null){
            tmpList.next = list2;
        }
        if (list2 == null){
            tmpList.next = list1;
        }
        return newList.next;
    }

    //递归法
    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        if (list1 == null){
            return list2;
        }else if (list2 == null){
            return list1;
        }else if (list1.val < list2.val){
            list1.next = mergeTwoLists1(list1.next, list2);
            return list1;
        }else{
            list2.next = mergeTwoLists1(list1, list2.next);
            return list2;
        }
    }

}

class ListNode {
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

