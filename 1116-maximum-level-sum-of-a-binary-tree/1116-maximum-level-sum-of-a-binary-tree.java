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

        int maxl=0;
        int maxsum=Integer.MIN_VALUE;
       Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int l=1;
        while(!q.isEmpty()){
            int s=q.size();
            int sum=0;
            for(int i=0;i<s;i++){
                TreeNode r=q.poll();
                if(r.left!=null) q.add(r.left);
                if(r.right!=null) q.add(r.right);
                sum+=r.val;

            }
            if(sum>maxsum){
                maxsum=sum;
                maxl=l;
            }
            l++;

        }

        return maxl;
        
    }
}