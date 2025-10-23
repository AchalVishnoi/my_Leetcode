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
    TreeNode first,sec,prev=new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        solve(root);

        int temp=first.val;
        first.val=sec.val;
        sec.val=temp;
        
    }

    public void solve(TreeNode root){

        if(root==null) return;

        solve(root.left);
        if(first==null){
            if(prev.val>root.val) first=prev;
        }
        if(prev.val>root.val) sec=root;
        prev=root;
        solve(root.right);



    }
}