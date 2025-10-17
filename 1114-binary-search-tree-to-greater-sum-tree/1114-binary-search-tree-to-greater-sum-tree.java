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
    public TreeNode bstToGst(TreeNode root) {
        find(root,0);
        return root;
    }
    public int find(TreeNode root, int gsum){

      if(root==null) return 0;
      
      int a=find(root.right,gsum);
      
      int b=find(root.left,gsum+root.val+a);

      int c=a+root.val+b;

      root.val=root.val+a+gsum;



      return c;

    }
}