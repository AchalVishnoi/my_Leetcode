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

    int maxd;
    
    public TreeNode subtreeWithAllDeepest(TreeNode root) {

        maxd=findMaxd(root)-1;

        return find(root,0);
        
    }

    public int findMaxd(TreeNode root){

        if(root==null) return 0;

        return Math.max(findMaxd(root.left),findMaxd(root.right))+1;

    }

    public TreeNode find(TreeNode root,int d){

        if(root==null) return null;
        if(d==maxd) return root;


        TreeNode left=find(root.left,d+1);
        TreeNode rig=find(root.right,d+1);


        if(left!=null&&rig!=null) return root;

        if(left!=null) return left;
        if(rig!=null) return rig;

        return null;

    }
}