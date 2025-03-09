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
    public ListNode rotateRight(ListNode head, int k) {
        
               if(head==null||k==0){
                return head;
               }
               ListNode ptr=head;
             int i=1;
             while(ptr.next!=null&&i<k){
                ptr=ptr.next;
                i++;
             }

             if(ptr.next==null&&k%i==0){
                return head;
             }



             if(i<k){
                k=k%i;
                ptr=head;
                i=1;
             
             while(ptr!=null&&i<k){
                ptr=ptr.next;
                i++;
             }

             }

             

             ListNode ptr1=head;
             ListNode ptr3=head;
             while(ptr!=null&&ptr.next!=null){
                ptr=ptr.next;
                ptr3=ptr1;
                ptr1=ptr1.next;
             }
             
             ptr.next=head;
             ptr3.next=null;



     return ptr1;
    }
}