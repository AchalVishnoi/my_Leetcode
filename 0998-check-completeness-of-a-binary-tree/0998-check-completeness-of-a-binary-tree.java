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
    public boolean isCompleteTree(TreeNode root) {

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean fl=false;
        while(!q.isEmpty()){

            int s=q.size();
            for(int i=0;i<s;i++){
              TreeNode a=q.poll();

              if(fl&&(a.left!=null||a.right!=null)) return false;
              if(a.left!=null) q.add(a.left);
              else fl=true;
              if(a.right!=null){
                if(fl) return false;
                q.add(a.right);
              }
              else fl=true;


              

            }

        }

        return true;
        
    }
}