class Solution {
    public int climbStairs(int n) {
         
        int []dp=new int[n];
        Arrays.fill(dp,-1);
        return step(0,n,dp);
        
    }
     
     public int step(int i, int n , int dp[]){
       
       if(i>n){
        return 0;
       }
       if(i==n){
        return 1;
       }
       if(dp[i]!=-1) return dp[i];

       dp[i]=step(i+1,n,dp)+step(i+2,n,dp);

     return dp[i];
     }




}