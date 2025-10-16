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
    int maxDepth=-1;
    int sum=0;
    public int deepestLeavesSum(TreeNode root) {
        find(root,0);
        return sum;
    }
    public void find(TreeNode root,int l){
        
        if(root==null) return;
        if(root.left==null&&root.right==null){
            if(maxDepth<l){
                sum=0;
                sum=root.val;
                maxDepth=l;
            }
            else if(maxDepth==l) sum+=root.val;
            return;
        }

       

       find(root.left, l+1);
       find(root.right,l+1);





    }
}