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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return solve(root,target);
    }
    private TreeNode solve(TreeNode root,int tar){
      
      if(root==null) return null;
      

      root.left=solve(root.left,tar);
      root.right=solve(root.right,tar);

      if(root.val==tar&&root.left==null&&root.right==null) return null;

      return root;

      


    }
}