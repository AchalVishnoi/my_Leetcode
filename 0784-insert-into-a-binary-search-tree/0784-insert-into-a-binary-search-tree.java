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
    public TreeNode insertIntoBST(TreeNode root, int val) {

        return find(root,val);
        
    }
    public TreeNode find(TreeNode root, int val){
        
        if(root==null) return new TreeNode(val);

        if(root.val>val){
            root.left=find(root.left,val);
        }
        else{
            root.right=find(root.right,val);
        }



     return root;
    }
}