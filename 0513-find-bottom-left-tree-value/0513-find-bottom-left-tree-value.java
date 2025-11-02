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
    int a[]=new int[2];
    public int findBottomLeftValue(TreeNode root) {
        a[1]=root.val;
        find(root,0);
        return a[1];
    }

    public void find(TreeNode root,int l){
        if(root==null) return;
     
      if(a[0]<l) {
        a[0]=l;
        a[1]=root.val;
      }
      find(root.left,l+1);
      find(root.right,l+1);

    }
}