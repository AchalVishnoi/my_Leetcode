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
    public int pathSum(TreeNode root, int targetSum) {

        find(root,new ArrayList<>(),0,targetSum);
        return ans;
    }

    public void find(TreeNode root,List<Long> prev,long sum,int tar){
      if(root==null) return;

      int val=root.val;
      
      sum+=val;

      
      if(sum==tar) ans++;

      for(long pre:prev) 
       if(pre==sum-tar) ans++;


      
      prev.add((long)sum);
      find(root.left,prev,sum,tar);
      find(root.right,prev,sum,tar);
      prev.remove(prev.size()-1);



    }
}