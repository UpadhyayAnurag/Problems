package LinkedList;

public class FindKthNodeFromEnd {
    public static int getKthFromLast(ListNode head, int k) {

        ListNode leading = head, trailing = head;

        while(--k>0){
            if(leading!=null){
                leading = leading.next;
            }
        }

        if(leading==null){
            return -1;
        }

        while(leading.next != null){
            leading = leading.next;
            trailing = trailing.next;
        }
        return trailing.val;
    }
}
