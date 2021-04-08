package practice.list;

/**
 * 142 环形链表一般都使用双指针
 * 此处a是head到环表入口节点
 * b是环表的长度
 * 参考：https://leetcode-cn.com/problems/linked-list-cycle-ii/solution/linked-list-cycle-ii-kuai-man-zhi-zhen-shuang-zhi-/
 * 1.第一次相遇的时候，slow = nb
 * 2.a+nb = 入口点
 * 3.slow再走a = 入口 = head走到入口 = a
 * 4.由3得出，起始距离入口 = 第一次相遇位置 + a
 */
public class detectCycle1 {
    public ListNode detectCycle(ListNode head) {
        if (head==null) return null;
        ListNode fast = head;
        ListNode slow = head;
        boolean isCycle = false;
        while (fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow) isCycle=true;
        }
        if (!isCycle) return null;
        fast=head;
        while (fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
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
