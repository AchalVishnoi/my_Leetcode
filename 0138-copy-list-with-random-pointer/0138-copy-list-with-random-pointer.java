/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    HashMap<Node,Node> h=new HashMap<>();
    public Node copyRandomList(Node head) {
        return copy(head);
    }

    public Node copy(Node head){

      if(head==null) return null;
      if(h.containsKey(head)) return h.get(head);  

      

      Node n=new Node(head.val,null,null);
      h.put(head,n);
      n.next=copy(head.next);
      n.random=copy(head.random);


      return n;



    }
}