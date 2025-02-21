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
/*class FindElements {
    
    TreeNode root;

    public FindElements(TreeNode root) {
        this.root=root;
        this.root.val=0;
      
        recover(this.root);
        
    }
    
    public boolean find(int target) {

    return isPresent(target,this.root);
        
    }



    public void recover(TreeNode root){
     

     if(root.left!=null){
        root.left.val=root.val*2+1;
        recover(root.left);
     }
     if(root.right!=null){
        root.right.val=root.val*2+2;
        recover(root.right);
     }

    }


    public boolean isPresent(int tar,TreeNode r){
        if(r==null) return false;
        if(r.val==tar) return true;
        return isPresent(tar,r.left)||isPresent(tar,r.right);
    }
}
*/

class FindElements {
    
    TreeNode root;
    HashSet <Integer> h;
    public FindElements(TreeNode root) {
        this.root=root;
        this.root.val=0;
        h=new HashSet<>();
        h.add(0);
      
        recover(this.root);
        
    }
    
    public boolean find(int target) {

    return isPresent(target);
        
    }



    public void recover(TreeNode root){
     

     if(root.left!=null){
        h.add(root.val*2+1);
        root.left.val=root.val*2+1;
        recover(root.left);
     }
     if(root.right!=null){
        h.add(root.val*2+2);
        root.right.val=root.val*2+2;
        recover(root.right);
     }

    }


    public boolean isPresent(int tar){
        
        return h.contains(tar);
    }
}




/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */