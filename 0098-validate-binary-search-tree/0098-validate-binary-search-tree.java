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
    public boolean isValidBST(TreeNode root) {


 
   
       return triv(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean triv(TreeNode root, long min, long max){
     if(root==null) return true;

     if(root.val>=max||root.val<=min) return false;
      return triv(root.left,min,root.val)&&triv(root.right,root.val,max);
    }
}