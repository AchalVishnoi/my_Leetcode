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
    public int goodNodes(TreeNode root) {
        if(root==null) return ans;
        find(root,root.val);
        return ans;
    }
    public void find(TreeNode root, int gret){

     if(root==null) return;
     
     if(root.val>=gret){
        ans++;
        gret=root.val;
     }
     find(root.left,gret);
     find(root.right,gret);


    }
}