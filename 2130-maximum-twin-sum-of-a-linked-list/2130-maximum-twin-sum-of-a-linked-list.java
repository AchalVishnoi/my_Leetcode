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
    public ListNode rev(ListNode head)
     {
        if(head==null||head.next==null) return head;
       ListNode h=rev(head.next);
       head.next.next=head;
       head.next=null;
       return h;
     }


    public int pairSum(ListNode head) {
        int maxSum=-1;
        ListNode slow=head,fast=head,p1=head,p2;
        while(fast.next!=null&&fast.next.next!=null){
        fast=fast.next.next;
        slow=slow.next;

         }
        p2=rev(slow.next);
        while(p2!=null){
            if(p1.val+p2.val>maxSum) maxSum=p1.val+p2.val;
            p1=p1.next;
            p2=p2.next;
        }
        return maxSum;


    





    }
}