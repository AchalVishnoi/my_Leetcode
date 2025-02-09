class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
     
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
    
        ListNode curr = prev.next;
        ListNode next = curr.next;
     
        for (int i = left; i <right; i++) {
         ListNode temp=next.next;
                       
   next.next = prev.next;
            prev.next = next;
            curr.next = temp;
            
            next = temp;
        }
        
        return dummy.next;

    }
}