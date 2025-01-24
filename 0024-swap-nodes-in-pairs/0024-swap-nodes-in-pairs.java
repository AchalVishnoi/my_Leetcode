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
    public ListNode swapPairs(ListNode head) {

        return swap(head);
        
    }


    public ListNode swap(ListNode a){
        if(a==null||a.next==null) return a;
        
           
        ListNode b=swap(a.next.next);  

        ListNode temp=a.next;
        temp.next=a;
        a.next=b;
        return temp; 





    }
}