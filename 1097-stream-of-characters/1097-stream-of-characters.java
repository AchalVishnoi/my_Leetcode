class StreamChecker {

    Trie tr=new Trie();

    StringBuilder st=new StringBuilder();

    public StreamChecker(String[] words) {

        for (String word : words) {
            tr.insert(new StringBuilder(word).reverse().toString());
        }

        
    }
    
    public boolean query(char letter) {

        st.append(letter);

        Node curr=tr.start;



        for(int i=st.length()-1;i>=0&&curr!=null;i--){
            

            int idx=st.charAt(i)-'a';

            curr = curr.ch[idx];

            if(curr!=null&&curr.isWord) return true;
        }

        return false;


        
    }
}


   public class Node{
    boolean isWord;
    Node ch[];

     Node(){
        isWord=false;
        ch=new Node[26];
     }


   }



class Trie {




     

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
    

}






/**
 * Your StreamChecker object will be instantiated and called as such:
 * StreamChecker obj = new StreamChecker(words);
 * boolean param_1 = obj.query(letter);
 */