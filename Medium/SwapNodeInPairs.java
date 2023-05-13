package Medium;

public class SwapNodeInPairs {
    public static void main(String[] args) {
        
    }
    public ListNode swapNodesInParis(ListNode head) {
        if (head == null || head.next == null) 
            return head;
 
        ListNode curr = head, prev = null;
        ListNode newHead = head.next;
 
        while(curr != null && curr.next != null)
        {
            // Initialize first, second and third references
            ListNode first = curr;
            ListNode second = curr.next;
            ListNode third = curr.next.next;
 
            // Update referene for the previous node
            if(prev != null)
                prev.next = second;
 
            // Swap first and second nodes
            first.next = third;
            second.next = first;
 
            // Update prev and curr references
            prev = first;
            curr = third;
        }
        return newHead;
    }
}
