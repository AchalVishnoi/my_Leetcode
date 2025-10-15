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
    public TreeNode reverseOddLevels(TreeNode root) {

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int l=0;
        while(!q.isEmpty()){
            Stack<TreeNode> k=new Stack<>();
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode r=q.poll();
                if(r.left!=null) q.add(r.left);
                if(r.right!=null) q.add(r.right);
                if(l%2!=0){
                if(i<s/2) k.add(r);
                else{
                    TreeNode p=k.pop();
                    int temp=r.val;
                    r.val=p.val;
                    p.val=temp;

                }
                }


            }

            l++;

        }

        return root;
        
    }
}