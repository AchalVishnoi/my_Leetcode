class Solution {
    Long dp[][][];
    int mod=1000000007;
    public int knightDialer(int n) {

        long ans=0;
        dp=new Long[4][3][n+1];
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                ans=(ans+find(i,j,n-1)%mod)%mod;
            }
        }

        return (int)ans;
        
    }
    public long find(int i,int j,int n){
        
        if(i<0||j<0||(i==3&&(j==0||j==2))||j>2||i>3) return 0;
        if(n==0) return 1;

        if(dp[i][j][n]!=null) return dp[i][j][n];
         
        long a=  (find(i+2,j-1,n-1)%mod+
                find(i+2,j+1,n-1)%mod+
                find(i-2,j-1,n-1)%mod+
                find(i-2,j+1,n-1)%mod+
                find(i-1,j-2,n-1)%mod+
                find(i-1,j+2,n-1)%mod+
                find(i+1,j-2,n-1)%mod+
                find(i+1,j+2,n-1)%mod)%mod;

        
        
        return dp[i][j][n]=a;



    }
}