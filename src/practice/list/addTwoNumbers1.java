package practice.list;

import java.util.List;

/**
 * 本题一定要注意不要算成整数了再加，长度根本不够，观察可知可以
 * 对两个链表的节点一个个的进行加法，然后进位，最后连成新的链表
 * 注意：new ListNode(sum%10)、list2.next = new ListNode(sum%10)以及最后要判断carry是否大于0
 * 如果大于0则表示还要进一位
 */
public class addTwoNumbers1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1 =null;
        ListNode list2 =null;
        int carry = 0;
        while(l1!=null||l2!=null){
            int n1 = l1!=null ? l1.val : 0;
            int n2 = l2!=null ? l2.val : 0;
            int sum = n1 +n2 + carry;
            if(list1==null){
                list1 = list2 =new ListNode(sum%10);
            }else{
                list2.next = new ListNode(sum%10);
                list2 = list2.next;
            }
            carry = sum/10;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        if(carry>0)
            list2.next = new ListNode(carry);
        return list1;
    }


    private class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
  }

}
