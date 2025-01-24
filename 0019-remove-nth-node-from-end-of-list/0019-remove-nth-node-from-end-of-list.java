/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

     ListNode ptr=head;
    if(head==null||head.next==null) return null;

    for(int i=2;i<=n;i++){
        ptr=ptr.next;
    }

    if(ptr.next==null) {
        head=head.next;
    }
    else{
        ListNode m=head;
        while(ptr.next.next!=null){
            ptr=ptr.next;
            m=m.next;
            
        }
        m.next=m.next.next;
    }

return head;


    }
}