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
    int ans=Integer.MIN_VALUE;
    public int longestZigZag(TreeNode root) {
        find(root);
        return ans;
    }

    public int[] find(TreeNode root){

      if(root==null) return new int[2];  


      int[] a=find(root.left);
      int[] b=find(root.right);

      int c[]=new int[2];
      c[0]=1;
      c[1]=1;
      c[0]+=a[1];
      c[1]+=b[0];
      ans=Math.max(c[0]-1,ans);
      ans=Math.max(c[1]-1,ans);



     return c;
    }
}