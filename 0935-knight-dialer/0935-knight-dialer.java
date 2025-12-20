class Solution {
    Long dp[][][];
    int mod=1000000007;
    public int knightDialer(int n) {

    int[][] moves = {
             {4, 6},
             {6, 8},
             {7, 9},
             {4, 8},
             {0, 3, 9},
             {},
             {0, 1, 7},
             {2, 6},
             {1, 3},
             {2, 4}
                     };




        long dp[]=new long[10];
        Arrays.fill(dp,1);


        for(int i=2;i<=n;i++){
            long next[]=new long[10];
            for(int d=0;d<10;d++){
                for(int t:moves[d]){
                    next[t]=(next[t]+dp[d])%mod;
                }
            }

            dp=next;
        } 


        long ans=0;
        for(int i=0;i<10;i++) ans=(ans+dp[i])%mod;


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