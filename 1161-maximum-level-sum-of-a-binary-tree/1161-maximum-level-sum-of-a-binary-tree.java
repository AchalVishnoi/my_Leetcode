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
    public int maxLevelSum(TreeNode root) {

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int i=1;
        int max=root.val;
        int ans=1;

        while(!q.isEmpty()){
            int s=q.size();
            int curr=0;
            for(int j=0;j<s;j++){
               TreeNode a=q.poll();
               curr+=a.val;
               if(a.left!=null){
                 q.add(a.left);
               }
               if(a.right!=null){
                 q.add(a.right);
               }
            }
            if(max<curr){
               ans=i;
               max=curr;
            }
            i++;

        }

        return ans;
        
        
    }
}