/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Node,Node> nodes=new HashMap<>();
    public Node cloneGraph(Node node) {
        return clone(node);
    }

    public Node clone(Node node){

      if(node==null) return null;

      if(nodes.containsKey(node)) return nodes.get(node);
      
      Node n=new Node(node.val,new ArrayList<>());
      nodes.put(node,n);
     
      
      for(Node r:node.neighbors){
          n.neighbors.add(clone(r));
      }

      nodes.put(node,n);

     return n;

    }
}