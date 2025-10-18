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
    public int countPairs(TreeNode root, int dis) {
        find(root,dis);
        return ans;
    }

    public List<Integer> find(TreeNode root,int dis){

        if(root==null) return null;

        if(root.left==null&&root.right==null){
            List<Integer> r=new ArrayList<>();
            r.add(0);
            return r;
        }

        List<Integer> a=find(root.left,dis);
        List<Integer> b=find(root.right,dis);


        if(a!=null){
            for(int i=0;i<a.size();i++) a.set(i,a.get(i)+1);
        }
        if(b!=null){
            for(int i=0;i<b.size();i++) b.set(i,b.get(i)+1);
        }


        if(a==null) return b;
        if(b==null) return a;

        
        for(int i=0;i<a.size();i++){
            for(int j=0;j<b.size();j++){
                if(a.get(i)+b.get(j)<=dis) ans++;
            }
        }

        a.addAll(b);


        return a;

    }
}