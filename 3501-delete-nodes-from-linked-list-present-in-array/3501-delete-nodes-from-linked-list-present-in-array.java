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
    public ListNode modifiedList(int[] nums, ListNode head) {

        Set<Integer> s=new HashSet<>();
        for(int num:nums) s.add(num);
        ListNode prev=head;
        ListNode temp=prev.next;
        while(temp!=null){
            if(s.contains(temp.val)){
                prev.next=temp.next;
                temp=prev.next;
            }
            else{
                prev=temp;
                temp=temp.next;
            }
        }

        if(s.contains(head.val)) head=head.next;

        return head;
        
    }
}