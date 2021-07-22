package practice.list;

public class reverseBetween_92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dy = new ListNode(0);
        dy.next = head;
        ListNode p = dy;
        ListNode g = head;
        for (int i = 0; i < left; i++) {
            p = p.next;
            g = g.next;
        }
        for (int i = 0; i < right - left; i++) {
            ListNode temp = p.next;
            p.next=p.next.next;
            temp.next=p;
            g.next = temp;
        }
        return dy.next;
    }
    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

