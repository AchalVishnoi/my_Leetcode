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
     
    boolean ans=false; 

    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        solve(root,x,n);
        return ans;
    }

    public int solve(TreeNode root,int x,int n){
        
        if(root==null) return 0;
       
       int a=solve(root.left,x,n);
       int b=solve(root.right,x,n);

       if(root.val==x){
        if(a>(n-a)||b>(n-b)||(n-(a+b+1))>(a+b+1)) ans=true;
        return 0;

       }

       return a+b+1;


    }


}