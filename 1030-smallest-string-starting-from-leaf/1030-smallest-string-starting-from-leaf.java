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
    String ans=null;
    public String smallestFromLeaf(TreeNode root) {
        find(root,new StringBuilder());
        return ans;
    }
    public void find(TreeNode root,StringBuilder s){
      
      if(root==null) return;


      s.append((char)('a'+root.val));
      if(root.left==null&&root.right==null){
        String curr = s.reverse().toString();
        if(ans==null||(ans.compareTo(curr)>0)) ans=curr;
        s.reverse();
      }

      find(root.left,s);
      find(root.right,s);
      s.deleteCharAt(s.length()-1);




    }
}