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
    public boolean isEvenOddTree(TreeNode root) {

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int l=0;
        while(!q.isEmpty()){
            int s=q.size();
            int prev=0;
            for(int i=0;i<s;i++){

                TreeNode a=q.poll();

                if(l%2==0){
                    if(a.val%2!=0){
                        if(i!=0&&a.val<=prev) return false;
                    }
                    else return false;
                }
                else{
                    if(a.val%2==0){
                        if(i!=0&&a.val>=prev) return false;
                    }
                    else return false;                    
                }
                prev=a.val;
                if(a.left!=null) q.add(a.left);
                if(a.right!=null) q.add(a.right);

                

            }
            l++;
        }

        return true;
        
    }
}