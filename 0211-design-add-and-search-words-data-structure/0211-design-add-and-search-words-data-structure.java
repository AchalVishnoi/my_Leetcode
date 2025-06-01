class WordDictionary {



    private class Node{
         boolean isWord;
         Node ch[];

        Node(){
         isWord=false;
         ch=new Node[26];
        }


    }
     

   Node start;




    public WordDictionary() {

         start = new Node();
        
    }
    
    public void addWord(String word) {

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
        


        return search(word,start,0);





    }


    private boolean search(String word,Node head,int j){
        
        int n=word.length();
        if(head==null) return false;

        if(j>=word.length()){
            return head.isWord;
        }

        

        if(word.charAt(j)=='.'){

            boolean b = false;
            

            for(int i=0;i<26;i++){
                b|=search(word,head.ch[i],j+1);
            }

            return b;

        }

        else{

            

            if(head.ch[word.charAt(j)-'a']==null) return false;

            return search(word,head.ch[word.charAt(j)-'a'],j+1);
        }
        

        
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */