class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        
        int n=s.length();
        int a[]=new int[n];
        for(int x[]:shifts){
          int val = (x[2]==0?-1:1);
          a[x[0]]+=val;
          if(x[1]+1<n){
            a[x[1]+1]-=val;
          }
        }

        StringBuilder st=new StringBuilder();

        for(int i=0;i<n;i++){
            if(i>0) a[i]+=a[i-1];
            int t=s.charAt(i)-'a';
            t=(t+a[i]%26+26)%26;
            st.append((char)(t+'a'));
        }

        return st.toString();

        
    }
}