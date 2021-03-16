package practice.list;

public class mergeTwoLists1 {
    ListNode l3 = new ListNode(0);
    ListNode l4 = new ListNode(0);
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        l3 = l1;
        while (l1.next!=null) l4 = l1.next;
        l4.next=l2;
        return l3;

    }




      private class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
