package practice.list;

/**
 * 19 ① 先遍历得到链表长度，再找到需要删除的节点
 * ②用栈的形式，在遍历链表的同时将所有节点依次入栈
 * ③快慢指针
 */
public class removeNthFromEnd1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null) return null;
        int size = 0;
        ListNode dy=new ListNode(0);
        dy.next = head;
        ListNode cur = dy;
        while (cur!=null){
            size++;
            cur = cur.next;
        }
        cur =dy;
        for (int i = 0; i < size-n-1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return dy.next;
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
