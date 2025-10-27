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
    List<TreeNode> ans;
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
       ans=new ArrayList<>();
       Set<Integer> td = new HashSet<>();
       for (int val : to_delete) {
            td.add(val);
       }
        find(root,td);
        
        if(root!=null&&!td.contains(root.val)) ans.add(root);
        return ans;

        
    }
    public TreeNode find(TreeNode root,Set<Integer> l){
        if(root==null) return null;
        int val=root.val;
        TreeNode lef=find(root.left,l);
        TreeNode righ=find(root.right,l);
        if(l.contains(val)){
            if(lef!=null)
            ans.add(lef);
            if(righ!=null)
            ans.add(righ);
             
            return null;

        }

        root.left=lef;
        root.right=righ;

        return root;


    }
}