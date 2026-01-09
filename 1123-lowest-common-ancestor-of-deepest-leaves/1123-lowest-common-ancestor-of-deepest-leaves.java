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
    TreeNode r;
    int len=0;
    public TreeNode lcaDeepestLeaves(TreeNode root) {

        find(root,0);
        return r;
        
    }
    private int find(TreeNode root,int l){

        if(root==null) return l;



        int a=find(root.left,l+1);
        int b=find(root.right,l+1);

        if(a==b&&a>=len){
            len=a;
            r=root;
        }
        
        return Math.max(a,b);


    }
}