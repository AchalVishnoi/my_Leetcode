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
    int ans=0;
    public int averageOfSubtree(TreeNode root) {
        find(root);
        return ans;
    }
    public int[] find(TreeNode root){
     
     if(root==null) return new int[]{0,0};
      

      int a[]=new int [2];
      int b[]=find(root.left);
      int c[]=find(root.right);

      a[0]=b[0]+c[0]+root.val;
      a[1]=b[1]+c[1]+1;

      if(a[0]/a[1]==root.val) ans++;
        
        return a;

    }
}