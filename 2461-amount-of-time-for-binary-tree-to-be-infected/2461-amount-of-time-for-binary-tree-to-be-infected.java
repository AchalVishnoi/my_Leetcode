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
    HashMap<TreeNode,TreeNode> par=new HashMap<>();
    public int amountOfTime(TreeNode root, int start) {
        find(root,start);
        return ans;
    }

    public void find(TreeNode root,int start){

        if(root==null) return;

        if(root.val==start){
            Queue<TreeNode> q=new LinkedList<>();
            Set<TreeNode> vis=new HashSet<>();
            
            q.add(root);
            while(true){
                int s=q.size();
                for(int i=0;i<s;i++){
                    TreeNode r=q.poll();
                    if(r.left!=null&&(!vis.contains(r.left))) q.add(r.left);
                    if(r.right!=null&&(!vis.contains(r.right))) q.add(r.right);
                    if(par.get(r)!=null&&(!vis.contains(par.get(r)))) q.add(par.get(r));
                    vis.add(r);

                }

                if(q.isEmpty())  break;
                ans++;
            }

            return;
        }

        if(root.left!=null) par.put(root.left,root);
        if(root.right!=null) par.put(root.right,root);

        if(ans==0) find(root.left,start);
        if(ans==0) find(root.right,start);


    }
}