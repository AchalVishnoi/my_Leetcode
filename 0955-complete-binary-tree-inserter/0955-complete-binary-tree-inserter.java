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
class CBTInserter {

    TreeNode root;
    Queue<TreeNode> q=new LinkedList<>();

    public CBTInserter(TreeNode root) {

        this.root=root;
        q.add(root);
        while(!q.isEmpty()){
           
            TreeNode r=q.peek();
            if(r.left!=null){
                q.add(r.left);
            }
            else break;
            if(r.right!=null){
                q.add(r.right);
                q.poll();
            }
            else break;
        }


        
    }
    
    public int insert(int val) {

        TreeNode r=new TreeNode(val);
        TreeNode t=q.peek();
        q.add(r);
        if(t.left==null) t.left=r;
        else{
            t.right=r;
            q.poll();
        }

        return t.val;
        
    }
    
    public TreeNode get_root() {

        return root;
        
    }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(val);
 * TreeNode param_2 = obj.get_root();
 */