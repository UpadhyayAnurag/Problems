package LinkedList;

public class RotateList {
    public static ListNode rotate(ListNode head, int k) {
        // code here
        ListNode curr = head, endNode = null, prev = null, temp = head;
        int count = 0;

        while(temp!=null){
            count++;
            endNode = temp;
            temp = temp.next;
        }
        k = k%count;
        if(k==0){
            return head;
        }

        curr = head;
        while(k>1){
            curr = curr.next;
            k--;
        }
        System.out.println(curr.val);
        prev = curr;
        curr = curr.next;
        endNode.next = head;
        prev.next = null;
        head = curr;

        return head;
    }
}
