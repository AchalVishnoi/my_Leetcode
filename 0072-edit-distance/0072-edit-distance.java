class Solution {
    int ans=Integer.MAX_VALUE;
    Integer dp[][];
    public int minDistance(String w1, String w2) {
      int n=w1.length();
      int m=w2.length();       
        dp=new Integer[n][m];
        return find(w1,w2,0,0);
        
    }
    public int find(String w1,String w2,int i,int j){

      int n=w1.length();
      int m=w2.length();
      if(i>=n) return m-j;
      if(j>=m) return n-i;

      if(dp[i][j]!=null) return dp[i][j];

      if(w1.charAt(i)==w2.charAt(j)) return dp[i][j]=find(w1,w2,i+1,j+1);

      int a=find(w1,w2,i+1,j+1);
        a=Math.min(find(w1,w2,i+1,j),a);
        a=Math.min(find(w1,w2,i,j+1),a);
      

      return dp[i][j]=a+1;

    }
}