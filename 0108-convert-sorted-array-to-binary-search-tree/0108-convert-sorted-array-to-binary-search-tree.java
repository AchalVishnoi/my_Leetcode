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
    public TreeNode sortedArrayToBST(int[] nums) {
        return find(nums,0,nums.length-1);
    }
    public TreeNode find(int nums[],int i,int j){
     
      if(j<i) return null;
      

      int mid=i+(j-i)/2;
      TreeNode a=new TreeNode(nums[mid]);
      a.left=find(nums,i,mid-1);
      a.right=find(nums,mid+1,j);


     return a;
    }
}