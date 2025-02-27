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
    int pi;
    public TreeNode buildTree(int[] pr, int[] in) {
        HashMap <Integer ,Integer> h =new HashMap<>();
    for(int i=0;i<in.length;i++){
      h.put(in[i],i);
    }

    pi=0;

    TreeNode root =find(h,0,in.length-1,pr);

    return root;
    }

    public TreeNode find( HashMap <Integer ,Integer> h, int st,int end, int po[]){
     
    if(st>end) return null;
    if(pi<0||pi>=po.length) return null;
    
    TreeNode r=new TreeNode(po[pi]);
    int idx=h.get(po[pi]);
     pi++;
      
      r.left=find(h,st,idx-1,po);
      r.right=find(h,idx+1,end,po);
      

     return r;

    }
}