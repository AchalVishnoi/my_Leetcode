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
    public boolean isBalanced(TreeNode root) {
        return check(root)!=-1;
    }
    
/*    public boolean isBal(TreeNode root){
      
      if(root==null) return true;
      if(Math.abs(height(root.left)-height(root.right))>1) return false;
     
     return isBal(root.left)&&isBal(root.right);

    }

    public int height(TreeNode root){
     
     if(root==null) return 0;

     int lef=height(root.left);
     int rig=height(root.right);

   
   return Math.max(lef,rig)+1;

   }
*/


public int check(TreeNode root){

   if(root==null) return 0;

    int lef = check(root.left);
    if (lef == -1) return -1; 

    int rig = check(root.right);
    if (rig == -1) return -1;

      if (Math.abs(lef- rig) > 1) return -1;
   
   return Math.max(lef,rig)+1;



}

}