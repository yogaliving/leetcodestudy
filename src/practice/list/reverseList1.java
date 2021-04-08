package practice.list;

/**
 * 206 注意需要 当前节点，当前节点的前一个节点以及临时节点
 */
public class reverseList1 {
    ListNode pre ;
    ListNode curr;
    public ListNode reverseList(ListNode head) {
        if (head==null) return null;
        ListNode temp = null;
        pre = null;
        curr = head;
        while (curr!=null){
            temp = new ListNode(curr.val);
            temp.next = pre;
            pre = temp;
            curr = curr.next;
        }
        return temp;
    }
    public ListNode reverseList2(ListNode head) {
        if (head==null) return null;
        ListNode temp = null;
        pre = null;
        curr = head;
        while (curr!=null){
            temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return curr;
    }

    private class ListNode {
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
}
