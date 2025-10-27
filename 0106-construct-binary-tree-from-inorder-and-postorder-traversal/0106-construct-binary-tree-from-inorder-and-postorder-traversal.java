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
    int i = 0;
    public TreeNode buildTree(int[] in, int[] post) {
        int n = post.length;
        i = n - 1;
        return find(0, n - 1, post, in);
    }

    public TreeNode find(int st, int end, int[] post, int[] in) {
        if (st > end) return null;

        int rootVal = post[i];
        int j = st;
        while (j <= end) {
            if (in[j] == rootVal) break;
            j++;
        }
        if (j > end) return null;

        i--;

        TreeNode right = find(j + 1, end, post, in);
        TreeNode left = find(st, j - 1, post, in);

        TreeNode r = new TreeNode(rootVal);

        r.left=left;
        r.right=right;

       

        return r;
    }
}
