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

    List<TreeNode> l;
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        l=new ArrayList<>();
        find(root,new HashMap<>());

        return l;
        
    }

    public String find(TreeNode root, HashMap<String,Integer> h){
        if(root==null) return "#";
        String s= String.valueOf(root.val);
        s+=",";
        s+=find(root.left,h);
        s+=",";
        s+=find(root.right,h);
        if(h.containsKey(s)&&h.get(s)==1) l.add(root);
        h.put(s,h.getOrDefault(s,0)+1);
        return s;
    }


}