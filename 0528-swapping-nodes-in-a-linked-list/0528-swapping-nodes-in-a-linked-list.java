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
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode ptr=head;
        while(--k>0){
            ptr=ptr.next;
        }
        int temp=ptr.val;
        ListNode p1=head;
        ListNode p2=ptr;
        while(p2.next!=null){
            p2=p2.next;
            p1=p1.next;
        }
        ptr.val=p1.val;
        p1.val=temp;
        return head;

 }
}