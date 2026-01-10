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
    public int minCameraCover(TreeNode root) {

        if(find(root)==0) ans++;
        return ans;
        
    }

    private int find(TreeNode root){

        if(root==null) return 1;


        int a=find(root.left);
        int b=find(root.right);

        if(a==0||b==0){
            ans++;
            return 2;
        }

        if(a==2||b==2){
            return 1;
        }


        return 0;




    }
}