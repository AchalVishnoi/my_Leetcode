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
    List<Integer> arr;
    public TreeNode balanceBST(TreeNode root) {
        arr=new ArrayList<>();
        treeToArr(root);
        return arrToTree(0,arr.size()-1);
        
    }
    public void treeToArr(TreeNode root){
          if(root==null) return;

        treeToArr(root.left);
        arr.add(root.val);
        treeToArr(root.right);
    }
    public TreeNode arrToTree(int st,int end){

        if(st>end) return null;

        int mid=st+(end-st)/2;
        TreeNode r=arrToTree(mid+1,end);
        TreeNode l=arrToTree(st,mid-1);
        TreeNode t=new TreeNode(arr.get(mid));

        t.left=l;
        t.right=r;
        return t;
    }
}