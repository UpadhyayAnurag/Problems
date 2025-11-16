package LinkedList;

public class ReverseADoublyLL {
    public static DoublyListNode reverseDoublyLL(DoublyListNode head) {
        DoublyListNode dummy = null;
        DoublyListNode curr = head;

        while(curr != null) {
            dummy = curr.next;
            curr.next = curr.prev;
            curr.prev = dummy;

            if(curr.prev == null){
                return curr;
            }
            curr = curr.prev;
        }
        return null;
    }
}
