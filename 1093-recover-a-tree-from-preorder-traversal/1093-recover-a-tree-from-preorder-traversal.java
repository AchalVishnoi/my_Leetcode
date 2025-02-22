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
    public TreeNode recoverFromPreorder(String str) {
      
       return dfs(0,new StringBuilder(str));
    
    }


   private TreeNode dfs(int level, StringBuilder s) {
        if (s.length() == 0) {
            return null;
        }

        // Count the number of dashes to determine depth
        int depth = 0;
        while (depth < s.length() && s.charAt(depth) == '-') {
            depth++;
        }

        // If the depth doesn't match the expected level, return null
        if (depth != level) {
            return null;
        }

        // Extract the number
        int num = 0, i = depth;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            i++;
        }

        // Remove processed characters
        s.delete(0, i);

        // Create the root node and recursively build subtrees
        TreeNode root = new TreeNode(num);
        root.left = dfs(level + 1, s);
        root.right = dfs(level + 1, s);

        return root;
    }

}