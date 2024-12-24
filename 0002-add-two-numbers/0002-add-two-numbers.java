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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode p1=l1,p2=l2;

         ListNode ans=new ListNode();

           int carry=0;
           

        return solve(carry,p1,p2);





    }

    public static ListNode solve( int carry, ListNode p1,ListNode p2){
       if(p1==null&&p2==null&&carry==0){
        return null;
       }

       int res= ((p1!=null)?p1.val:0)+((p2!=null)?p2.val:0)+carry;
        ListNode current=new ListNode(res%10);
            

            carry=res/10;
           if(p1!=null)  p1=p1.next;
           if(p2!=null) p2=p2.next;

           if(p1==null&&carry==0) current.next=p2;
           else if(p2==null&&carry==0) current.next=p1; 
           else current.next= solve( carry,p1,p2);

          return current;


    }
}