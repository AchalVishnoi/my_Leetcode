class Solution {
    int mod=1000000007;
    public int numOfArrays(int n, int m, int k) {

        return solve(0,m,n,new Integer[51][101][51],0,0,k)%mod;
        
    }
    public int solve(int idx,int m,int n, Integer dp[][][], int prevMax,int comp,int k){

        

        if(idx>=n){
            if(comp==k){
                return 1;
            }
            else{
                return 0;
            }
        }
        

        if(dp[idx][prevMax][comp]!=null) return dp[idx][prevMax][comp];

        int res=0;
        for(int i=1;i<=m;i++){
            if(i>prevMax){
              res=(res%mod+solve(idx+1,m,n,dp,i,comp+1,k)%mod)%mod;
            }
            else{

                res=(res%mod+solve(idx+1,m,n,dp,prevMax,comp,k)%mod)%mod;
            }
        }

        return dp[idx][prevMax][comp]=res;
    }
}