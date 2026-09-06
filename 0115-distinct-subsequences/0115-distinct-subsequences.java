class Solution {
    Integer dp[][];
    public int numDistinct(String s, String t) {
        dp=new Integer[s.length()][t.length()];
        return find(s,t,0,0);
    }

    private int find(String s,String t,int i,int j){
        int n=s.length();
        int m=t.length();
        if(j>=m) return 1;
        if(i>=n) return 0;

        if(dp[i][j]!=null) return dp[i][j];

        int ans=find(s,t,i+1,j);

        if(s.charAt(i)==t.charAt(j)) ans+=find(s,t,i+1,j+1);

        return dp[i][j]=ans;
    }
}