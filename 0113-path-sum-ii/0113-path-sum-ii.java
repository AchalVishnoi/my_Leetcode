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
    public List<List<Integer>> pathSum(TreeNode root, int tar) {
        List<List<Integer>> pathli=new ArrayList<>();
        sum(root,tar,new ArrayList<>(),pathli);
        return pathli;
    }



    public void sum(TreeNode root,  int tar, List<Integer> path,List<List<Integer>> pathli){
    
    if(root==null) return;


    path.add(root.val);
    if(tar-root.val==0&&root.left==null&&root.right==null){
       pathli.add(new ArrayList(path));
       
    }
  else{
    sum(root.left, tar-root.val,path,pathli);
    sum(root.right, tar-root.val,path,pathli);
   }

    path.remove(path.size()-1);
   


    }
}