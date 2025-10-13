/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {

        Node head=root;
        while(head!=null){

            Node temp=new Node(0);
            Node k=null;



            for(Node curr=head;curr!=null;curr=curr.next){
              
              if(curr.left!=null){
                temp.next=curr.left;
                temp=temp.next;
                if(k==null) k=temp;
              }
              if(curr.right!=null){
                temp.next=curr.right;
                temp=temp.next;
                if(k==null) k=temp;
              }
                

            }

            head=k;
            
        }

        return root;

    }
}