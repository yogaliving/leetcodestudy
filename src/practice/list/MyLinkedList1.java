package practice.list;

/**
 * 707
 */
public class MyLinkedList1 {
    /** Initialize your data structure here. */
    int size;
    ListNode head;  // sentinel node as pseudo-head
    public MyLinkedList1() {
        size = 0;
        head = new ListNode(0);
    }


    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index<0||index>=size) return -1;
        ListNode curr = head;
        for (int i = 0; i < index + 1; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index>size) return;
        if (index<0) index = 0;
        ++size;
        ListNode pred = head;
        for (int i = 0; i <index ; i++) { //找到要插入节点的前一个节点
            pred = pred.next;
        }
        ListNode toAdd = new ListNode(val);
        toAdd.next = pred.next;
        pred.next = toAdd;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        size--;
        ListNode pred = head;
        for (int i = 0; i <index ; i++) { //找到要插入节点的前一个节点
            pred = pred.next;
        }
        pred.next = pred.next.next;
    }
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
