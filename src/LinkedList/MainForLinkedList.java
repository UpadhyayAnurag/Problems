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
    }
}
