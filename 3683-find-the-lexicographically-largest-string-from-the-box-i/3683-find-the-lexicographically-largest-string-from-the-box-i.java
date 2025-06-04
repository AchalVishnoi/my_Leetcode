class Solution {
    public String answerString(String word, int numFriends) {


        if(numFriends==1) return word;
        
        int n=word.length();

      int i=0;
      char c=word.charAt(i);
      for(int j=1;j<n;j++){

       char curr=word.charAt(j);
       if(curr>c){
        c=curr;
        i=j;
        continue;
       }
       if(curr==c){
           
           int k=1;
           while(j+k<n){
            if(word.charAt(i+k)<word.charAt(j+k)){
                i=j;
                break;
            }
            else if(word.charAt(i+k)>word.charAt(j+k)){
                break;
            }
            k++;
            
           }




       }
        

      }


      return word.substring(i,Math.min(n,i+n-(numFriends-1)));


    }
}