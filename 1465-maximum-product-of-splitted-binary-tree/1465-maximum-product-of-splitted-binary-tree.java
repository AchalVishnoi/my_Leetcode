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
    long total=0;
    long ans=Long.MIN_VALUE;
    public int maxProduct(TreeNode root) {
        total=find(root);
        helper(root);
        return (int)(ans%1000000007);
    }
    public long find(TreeNode root){
        if(root==null) return 0;
        return root.val+find(root.left)+find(root.right);
    }
    public long helper(TreeNode root){

        if(root==null) return 0;


        long a=helper(root.left);
        long  b=helper(root.right);

        long sum=a+b+root.val;
        ans=Math.max((total-sum)*sum,ans);
        return sum;
    }
}