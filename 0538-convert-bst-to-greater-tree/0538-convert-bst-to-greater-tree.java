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
    public TreeNode convertBST(TreeNode root) {

        find(root,0);

        return root;
        
    }

    private int find(TreeNode root,int sum){
      
      if(root==null) return 0;

      int curr=root.val;

      root.val+=sum;

      int sumr=find(root.right,sum);
      root.val+=sumr;
      

      int suml=find(root.left,root.val);

      return curr+sumr+suml;


    }
}