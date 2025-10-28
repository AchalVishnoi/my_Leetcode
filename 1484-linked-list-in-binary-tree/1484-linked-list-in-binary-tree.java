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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {

        return find(head,root,0);
        
    }

    public boolean find(ListNode head,TreeNode root,int len){
      
      if(head==null) return true;
      if(root==null) return false;

      if(len!=0){
        if(head.val!=root.val)return false;
      }
      
      if(root.val==head.val){
        if(find(head.next,root.left,len+1)||
        find(head.next,root.right,len+1)) return true;
        if(len!=0) return false;
      }

      
      return find(head,root.left,len)||find(head,root.right,len);

    }
}