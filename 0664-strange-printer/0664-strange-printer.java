class Solution {
    Integer[][] dp;
    public int strangePrinter(String s) {
        int n=s.length();
        dp=new Integer[n][n];
        return find(s,0,n-1);
    }
    public int find(String s,int l,int r){

       if(l>r) return 0;

       if(dp[l][r]!=null) return dp[l][r];

       int ans=1+find(s,l+1,r);
       for(int i=l+1;i<=r;i++){
        if(s.charAt(i)==s.charAt(l)){
            ans=Math.min(
                ans,
                find(s,l+1,i-1)+find(s,i,r)
            );
        }
       }


       return dp[l][r]=ans;






    }
}