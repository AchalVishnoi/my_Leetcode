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
    List<Integer> h;
    public int kthLargestPerfectSubtree(TreeNode root, int k) {
        h=new ArrayList<>();
        dfs(root);
        Collections.sort(h);
        return k<=h.size()?h.get(h.size()-k):-1;
    }

    private int dfs(TreeNode root){
        if(root==null) return 0;
        int a=dfs(root.right);
        int b=dfs(root.left);
        if(a==-1||b==-1||a!=b) return -1;
        if(((a+b+2)&(a+b+1))==0){
            h.add(a+b+1);
        }
        return a+b+1;
    }
}