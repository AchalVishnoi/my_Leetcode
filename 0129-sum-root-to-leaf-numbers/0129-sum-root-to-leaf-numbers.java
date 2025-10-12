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
    public int sumNumbers(TreeNode root) {
        List<StringBuilder> paths = find(root);
        int total = 0;
        for (StringBuilder sb : paths) {
            total += Integer.parseInt(sb.toString());
        }
        return total;
    }

    private List<StringBuilder> find(TreeNode root) {
        List<StringBuilder> result = new ArrayList<>();
        if (root == null) return result;

        if (root.left == null && root.right == null) {
            result.add(new StringBuilder().append(root.val));
            return result;
        }

        for (StringBuilder sb : find(root.left)) {
            result.add(new StringBuilder().append(root.val).append(sb));
        }
        for (StringBuilder sb : find(root.right)) {
            result.add(new StringBuilder().append(root.val).append(sb));
        }

        return result;
    }
}
