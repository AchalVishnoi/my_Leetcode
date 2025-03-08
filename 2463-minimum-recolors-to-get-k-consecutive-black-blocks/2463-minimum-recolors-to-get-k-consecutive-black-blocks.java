class Solution {
    public int minimumRecolors(String b, int k) {


        int wcnt=0;
       
         int j=0;
         for(int i=0;i<k;i++){
         
          if(b.charAt(i)=='W') wcnt++;


         }
           
           int cnt=wcnt;

         for(int i=k;i<b.length();i++){
           if(b.charAt(i)=='W') cnt++;
           if(j<b.length())
           if(b.charAt(j)=='W') cnt--;
           j++;
           wcnt=Math.min(wcnt,cnt);
         }
       return wcnt; 
    }
}