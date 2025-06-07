class Solution {
    public String robotWithString(String s) {


     Stack <Character> st=new Stack<>();
     int freq[]=new int[26];

     for(Character c : s.toCharArray()){
        freq[c-'a']++;
     }

     StringBuilder res=new StringBuilder();
     int minChar=0;

     for(Character c : s.toCharArray()){

        freq[c-'a']--;
        st.push(c);

        while(minChar<26&&freq[minChar]==0){
            minChar++;
        }

        while(!st.isEmpty()&&st.peek()<=(char)(minChar+'a')) res.append(st.pop());

        



        
        
        }

        while(!st.isEmpty()){
                res.append(st.pop());
            }





      return res.toString(); 
    }
}