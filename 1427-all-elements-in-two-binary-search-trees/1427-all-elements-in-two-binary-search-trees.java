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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        List <Integer> a=new ArrayList<>();
        List <Integer> b=new ArrayList<>();
        find(root1,a);
        find(root2,b);
        int i=0;
        int j=0;
        List<Integer> ans=new ArrayList<>();
        while(i<a.size()&&j<b.size()){
           if(a.get(i)<b.get(j)) ans.add(a.get(i++));
           else ans.add(b.get(j++));
        }
        while(i<a.size()) ans.add(a.get(i++));
        while(j<b.size()) ans.add(b.get(j++));
        
        return ans;
    }
    private void find(TreeNode root,List<Integer> a){
        if(root==null) return;

        find(root.left,a);
        a.add(root.val);
        find(root.right,a);
    }
}