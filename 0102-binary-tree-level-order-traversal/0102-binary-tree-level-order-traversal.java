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
 /* //using loop
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

       return bfs(root); 
    }
   

    public List<List<Integer>> bfs(TreeNode root) {

        if(root==null) return new ArrayList<>();

        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> w=new ArrayList<>();
        q.add(root);
       
        while(!q.isEmpty()){
            int level=q.size();
         List<Integer> sub=new ArrayList<>();
         for(int i=0;i<;i++){
          
          TreeNode t=q.poll();
          sub.add(t.val);

          if(t.left!=null) q.add(t.left);
          if(t.right!=null) q.add(t.right);

          

         }
         
         w.add(sub);
         
        }




    return w;
        
    }

    
}
*/


class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        traverse(root, 0, result);
        return result;
    }

    private void traverse(TreeNode node, int level, List<List<Integer>> result) {
        if (node == null) return;

       
        if (result.size() == level) {
            result.add(new ArrayList<>());
        }

        
        result.get(level).add(node.val);

       
        traverse(node.left, level + 1, result);
        traverse(node.right, level + 1, result);
    }
}
