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
    int cost=0;
    public int distributeCoins(TreeNode root) {

        find(root);
        return cost;
        
    }

    private int find(TreeNode root){

        if(root==null) return 0;



        int a=find(root.left);
        int b=find(root.right);
        int c=a+b+root.val-1;

        cost+=Math.abs(c);
        return c;
    }


}