class Solution {
    double dp[];
    public double new21Game(int n, int k, int mp) {

        if(k==0||n>=k+mp-1) return 1;

        if(k>n) return 0;
        dp=new double[n+1];

        dp[0]=1;

        // for(int i=1;i<=n;i++){
        //     for(int x=1;x<=mp&&i-x>=0;x++){
        //         if(i-x<k){
        //             dp[i]+=(dp[i-x])/mp;
        //         }
        //     }
        // }





        double sum=1;
        for(int i=1;i<=n;i++){
            dp[i]=sum/mp;
            if(i<k) sum+=dp[i];
            if(i-mp>=0) sum-=dp[i-mp];
        }

        double ans=0;

        for (int i=k;i<=n;i++)
            ans+=dp[i];

        return ans;         
    }
}