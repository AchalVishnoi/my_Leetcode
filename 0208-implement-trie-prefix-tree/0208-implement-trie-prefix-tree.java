class Trie {



   private class Node{
    boolean isWord;
    Node ch[];

     Node(){
        isWord=false;
        ch=new Node[26];
     }


   }
     

   Node start;


    public Trie() {

        start = new Node();
        
    }
    
    public void insert(String word) {

        int n=word.length();
        Node head=start;

        for(int i=0;i<n;i++){
            int idx=word.charAt(i)-'a';
            if(head.ch[idx]==null){
                head.ch[idx]=new Node();
            }

            head=head.ch[idx];
        }

        head.isWord=true;
        
    }
    
    public boolean search(String word) {


        int n=word.length();
        Node head=start;

        for(int i=0;i<n;i++){
            int idx=word.charAt(i)-'a';
            if(head.ch[idx]==null){
                return false;
            }
            head=head.ch[idx];
        }

        return head.isWord;

        
    }
    
    public boolean startsWith(String prefix) {

        int n=prefix.length();
        Node head=start;

        for(int i=0;i<n;i++){
            int idx=prefix.charAt(i)-'a';
            if(head.ch[idx]==null){
                return false;
            }
            head=head.ch[idx];
        }

        return true;
        

    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */