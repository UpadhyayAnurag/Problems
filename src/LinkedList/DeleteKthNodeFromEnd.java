package LinkedList;

public class DeleteKthNodeFromEnd {
    public static ListNode deleteKthFromEnd(ListNode head, int k) {
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while(--k>0){
            fast = fast.next;;
        }
        if(fast.next==null){
            return head.next;
        }
        while(fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        if(prev.next!=null && slow!=null){
            prev.next = slow.next;
        }
        return head;
    }
}
