 class Solution {


    int MOD = 1_000_000_007;
    public int numberOfWays(int startPos, int endPos, int k) {
        
       int dp[][]=new int[2*k+1][k+1];

       for(int i=0;i<2*k+1;i++){
        Arrays.fill(dp[i],-1);
       }

       return find(startPos,endPos,k,dp, startPos-k);



    }

   public int find(int i, int end, int k, int dp[][], int off){

   if(k==0&&i==end) return 1;
   if(k==0&&i!=end) return 0;

   int idx= i-off;

   if(dp[idx][k]!=-1) return dp[idx][k];



    
    int ans= (find( i+1, end, k-1, dp, off) % MOD
           +find (i-1, end ,k-1, dp, off) % MOD) % MOD;



  return dp[idx][k]=ans;

   }




}