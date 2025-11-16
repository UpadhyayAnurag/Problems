package LinkedList;

public class MiddleOfALinkedList {
    public static int findMiddleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        assert slow != null;
        return slow.val;
    }
}
