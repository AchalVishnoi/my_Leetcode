class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null; 
        
        return buildTree(head);
    }

    private TreeNode buildTree(ListNode head) {
        if (head ==null) return null; 

        ListNode slow = head, fast = head;
        ListNode prev = null;

       
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        TreeNode root = new TreeNode(slow.val);

       
        if (prev != null) {
            prev.next = null;  
            root.left = buildTree(head);
        }

        root.right = buildTree(slow.next);

        return root;
    }
}
