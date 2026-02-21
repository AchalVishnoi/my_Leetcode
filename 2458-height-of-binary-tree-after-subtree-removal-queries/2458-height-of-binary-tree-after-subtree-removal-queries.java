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
    HashMap<TreeNode,Integer> hight;
    HashMap<Integer,Integer> ans;
    public int[] treeQueries(TreeNode root, int[] q) {

        hight=new HashMap<>(); 
        hight.put(null,-1);
        ans=new HashMap<>();
        populateH(root);
        populateAns(root,0,0);

        int arr[]=new int[q.length];

        int i=0;


        for(int x:q){

            arr[i++]=ans.get(x);

        }

        return arr;


    }

    public int populateH(TreeNode root){

        if(root==null) return -1;

        int h=Math.max(populateH(root.left),populateH(root.right))+1;

        hight.put(root,h);
        
        return h;
    }

    private void populateAns(TreeNode root,int parMax,int depth){

        if(root==null) return;

        int hl=hight.get(root.left);
        int hr=hight.get(root.right);

        ans.put(root.val,parMax);

        populateAns(root.left,Math.max(hr+1+depth,parMax),depth+1);
        populateAns(root.right,Math.max(hl+1+depth,parMax),depth+1);

    }
}