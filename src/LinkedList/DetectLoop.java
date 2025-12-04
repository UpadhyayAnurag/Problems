package LinkedList;

public class DetectLoop {
    public static boolean detectLoop(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode dummy = head;

        while(true){
            if(fast==null || fast.next==null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
    }
}
