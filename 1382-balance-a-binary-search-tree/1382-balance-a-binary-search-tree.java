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
    List<TreeNode> l=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root){

        inorder(root);


       return binaryTree(0,l.size()-1);

        
    }
    private void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        l.add(root);
        inorder(root.right);
    }
    private TreeNode binaryTree(int i,int j){

        if(i>j||i<0||j<0||i>l.size()||j>l.size()) return null;

        int mid=i+(j-i)/2;
        TreeNode root=l.get(mid);

        root.left=binaryTree(i,mid-1);
        root.right=binaryTree(mid+1,j);

        return root;
    }
}