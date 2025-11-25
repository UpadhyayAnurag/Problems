package LinkedList;

public class MainForLinkedList {
    public static void main(String[] args) {
        // Middle Of A Linked List
        System.out.println(MiddleOfALinkedList.findMiddleNode(new ListNode(2, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8))))))));

        // Delete Middle Node
        ListNode headMid = DeleteMiddleNode.deleteMiddle(new ListNode(2, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8)))))));
        while(headMid != null) {
            System.out.print(headMid.val+" ");
            headMid = headMid.next;
        }

        // Reverse Linked List
        ListNode headRev = ReverseLinkedList.reverseList(new ListNode(2, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8)))))));
        System.out.println();
        while(headRev != null) {
            System.out.print(headRev.val+" ");
            headRev = headRev.next;
        }

        // Creation of a Doubly Linked List
        DoublyListNode headDoublyLL = new DoublyListNode(1);
        {
            headDoublyLL.next = new DoublyListNode(2);
            headDoublyLL.next.prev = headDoublyLL;
            headDoublyLL.next.next = new DoublyListNode(3);
            headDoublyLL.next.next.prev = headDoublyLL.next;
        }

        // Reversing a Doubly Linked List
        DoublyListNode headDoublyRev = ReverseADoublyLL.reverseDoublyLL(headDoublyLL);
        System.out.println();
        while(headDoublyRev != null) {
            System.out.print(headDoublyRev.val+" ");
            headDoublyRev = headDoublyRev.next;
        }

        // Rotate List
        ListNode headRotateList = RotateList.rotate((new ListNode(2, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8))))))),2);
        System.out.println();
        while(headRotateList != null) {
            System.out.print(headRotateList.val+" ");
            headRotateList = headRotateList.next;
        }

        // Find kth from Last
        int kthValFromEnd = FindKthNodeFromEnd.getKthFromLast((new ListNode(2, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8))))))),6);
        System.out.println();
        System.out.println(kthValFromEnd);
    }
}
