package LinkedList;

public class DoublyListNode {
    int val;
    DoublyListNode next;
    DoublyListNode prev;

    public DoublyListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }

    public DoublyListNode(int val, DoublyListNode next, DoublyListNode prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}
