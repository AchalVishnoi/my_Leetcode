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
    public int maxAncestorDiff(TreeNode root) {

    find(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
    return ans;
        
        
    }
    public void find(TreeNode root,int min,int max){

        if(root==null){
            ans=Math.max(ans,Math.abs(min-max));
            return;
        }

        min=Math.min(root.val,min);
        max=Math.max(root.val,max);
        find(root.left,min,max);
        find(root.right,min,max);

     

    }
}