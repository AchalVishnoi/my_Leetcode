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
    HashSet<Integer> h=new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        return find(root,k);
    }
    private boolean find(TreeNode root,int k){
        if(root==null) return false;
        if(h.contains(k-root.val)) return true;
        h.add(root.val);
        return find(root.left,k)||find(root.right,k);
    }





}