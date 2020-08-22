package algorithm.java.niukewang;

public class SingleLinkList {

    ListNode head = null;

    public void addHead(int data){
        ListNode node = new ListNode(data);
        head = node;
    }

    public void addData(int data){
        ListNode node = new ListNode(data);
        if(head == null)
            head = node;
        else {
            ListNode temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    public void traverseLinkList(){
        ListNode temp = head;
        while (temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
