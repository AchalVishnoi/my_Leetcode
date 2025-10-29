/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<TreeNode,TreeNode> h;
    List<Integer> ans=new ArrayList<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        h=new HashMap<>();

        if(k==0){
            ans.add(target.val);
            return ans;
        }

        find(root,target,k);
        return ans;

        
        
    }

    public void find(TreeNode root,TreeNode tar,int k){

        if(root==null) return;

        if(root!=tar){
            if(root.left!=null) h.put(root.left,root);
            if(root.right!=null) h.put(root.right,root);
            find(root.left,tar,k);
            find(root.right,tar,k);
        }
        else{
            Set<TreeNode> vis=new HashSet<>();
            Queue<TreeNode> q=new LinkedList<>();
            q.add(root);
            int l=0;
            while(!q.isEmpty()){
                int s=q.size();
                for(int i=0;i<s;i++){
                   TreeNode r=q.poll();
                   if(r.left!=null&&(!vis.contains(r.left))){
                    if(l==k-1) ans.add(r.left.val);
                    else q.add(r.left);
                    
                   }
                   if(r.right!=null&&(!vis.contains(r.right))){
                    if(l==k-1) ans.add(r.right.val);
                    else q.add(r.right);
                   }
                   if(h.get(r)!=null&&!vis.contains(h.get(r))) {
                    if(l==k-1) ans.add(h.get(r).val);
                    else q.add(h.get(r));
                   }

                   vis.add(r);
                }
                l++;
                if(l==k) break;
            }


        }



    }
}