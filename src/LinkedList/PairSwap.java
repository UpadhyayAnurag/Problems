package LinkedList;

public class PairSwap {
    public static ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next;

        head = curr;
        while(true){
            next = curr.next;
            curr.next = prev;

            if(next==null || next.next == null){
                prev.next = next;
                break;
            }

            prev.next = next.next;
            prev = next;
            curr = prev.next;
        }
        return head;
    }
}
