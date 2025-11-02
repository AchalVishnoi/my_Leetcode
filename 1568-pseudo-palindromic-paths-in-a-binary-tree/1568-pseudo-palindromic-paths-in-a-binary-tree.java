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
    public int pseudoPalindromicPaths (TreeNode root) {
        find(root,ans);
        return ans;
    }

    public void find(TreeNode root,int track){

      if(root.left==null&&root.right==null){
        track^=(1<<root.val);
        if(track==0) ans++;
        else{
            for(int i=0;i<=9;i++){
                if(track==(1<<i)){
                    ans++;
                    break;
                }
            }
        }
        return;
      }  


      if(root.left!=null){
        find(root.left,track^(1<<root.val));
      }
      if(root.right!=null){
        find(root.right,track^(1<<root.val));
      }



    }
}