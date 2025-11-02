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
    public int longestUnivaluePath(TreeNode root) {

        if(root==null) return 0;

        find(root);

        return ans;
    }

    public int find(TreeNode root){
        

        int a=0,b=0;
        if(root.left!=null){
            a=find(root.left);
            if(root.val!=root.left.val) a=0;
        }

        
        if(root.right!=null){
            b=find(root.right);
            if(root.val!=root.right.val) b=0;
        }

        ans=Math.max(a+b,ans);

        return Math.max(a,b)+1;

    }

}