class Solution {
    int maxd = 0;

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        findmaxd(root, 0);
        return find(root, 0);
    }

    private void findmaxd(TreeNode r, int d) {
        if (r == null) return;

        if (r.left == null && r.right == null) {
            maxd = Math.max(d, maxd);
        }

        findmaxd(r.left, d + 1);
        findmaxd(r.right, d + 1);
    }

    private TreeNode find(TreeNode r, int d) {
        if (r == null) return null;

        if (d == maxd && r.left == null && r.right == null) {
            return r;
        }

        TreeNode lef = find(r.left, d + 1);
        TreeNode rig = find(r.right, d + 1);

        if (lef != null && rig != null) return r;
        return lef != null ? lef : rig;
    }
}
