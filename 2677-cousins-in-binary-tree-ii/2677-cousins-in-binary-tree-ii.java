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
    HashMap<Integer,Integer> lsum=new HashMap<>();
    public TreeNode replaceValueInTree(TreeNode root) {
        find(root,0);
        solve(root,0);
        root.val=0;
        return root;
    }
    private void find(TreeNode root,int l){
        if(root==null) return;
        lsum.put(l,lsum.getOrDefault(l,0)+root.val);
  
        find(root.left,l+1);
        find(root.right,l+1);
    }
    private void solve(TreeNode root, int l){
        if(root==null||(root.left==null&&root.right==null)) return;

        
        int sum=0;
        if(root.left!=null)sum+=root.left.val;
        if(root.right!=null)sum+=root.right.val;

        if(root.left!=null){
            root.left.val=lsum.get(l+1)-sum;
        }
        if(root.right!=null){
            root.right.val=lsum.get(l+1)-sum;
        }

        solve(root.left,l+1);
        solve(root.right,l+1);
        


        



    }
}