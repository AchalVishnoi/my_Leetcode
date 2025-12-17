class Solution {
    
    public int maxSumAfterPartitioning(int[] arr, int k) {

        int n=arr.length;
        int dp[]=new int[n+1];

        for(int i=n-1;i>=0;i--){
            for(int j=i;j<Math.min(n,i+k);j++){
               dp[i]=Math.max(dp[i],max(arr,i,j)*(j-i+1)+dp[j+1]);
            }
        }

        return dp[0];

        
    }

    private int max(int a[],int i,int j){
        int m=a[i];
        for(int k=i;k<=j;k++){
          m=Math.max(a[k],m);
        }

        return m;
    }
}