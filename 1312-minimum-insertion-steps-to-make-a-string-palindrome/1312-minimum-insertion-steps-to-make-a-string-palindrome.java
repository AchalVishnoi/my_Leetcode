class Solution {
    Integer t[][];
    public int minInsertions(String s) {
        if(isPalin(s)) return 0;
        int n=s.length();
        t=new Integer[n][n];

        return n-longestPalin(s,0,n-1);

        
        
    }

    public int longestPalin(String s,int i,int j){
      
      if(i>j) return 0;
      if(i==j) return 1;

      if(t[i][j]!=null) return t[i][j];

      if(s.charAt(i)==s.charAt(j)){
        return t[i][j]=2+longestPalin(s,i+1,j-1);
      }

      return t[i][j]=Math.max(longestPalin(s,i+1,j),longestPalin(s,i,j-1));








    }


   public boolean isPalin(String s){
    int i=0;
    int j=s.length()-1;
    while(i<j)
    if(s.charAt(i++)!=s.charAt(j--)) 
    return false;

    return true;
   }







}