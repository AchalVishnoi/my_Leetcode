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

        find(root,new HashMap<>(),0,targetSum);
        return ans;
    }

    public void find(TreeNode root,HashMap<Long,Integer> h,long sum,int tar){
      if(root==null) return;

      int val=root.val;
      
      sum+=val;

      
      if(sum==tar) ans++;

      if(h.containsKey(sum-tar)) ans+=h.get(sum-tar);


      
      h.put(sum,h.getOrDefault(sum,0)+1);
      find(root.left,h,sum,tar);
      find(root.right,h,sum,tar);
      h.put(sum,h.get(sum)-1);
      if(h.get(sum)==0) h.remove(sum);



    }
}