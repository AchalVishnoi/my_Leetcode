class Solution {
    public int rob(int[] sl) {

        int n=sl.length;
        if(n==1) return sl[0];


        int dp1[]=new int[n+1];
        int dp2[]=new int[n+1];

        for(int i=n-2;i>=0;i--){
           dp1[i]=Math.max(dp1[i+1],dp1[i+2]+sl[i]);
        }
        dp2[n-1]=sl[n-1];

        for(int i=n-2;i>=1;i--){
           dp2[i]=Math.max(dp2[i+1],dp2[i+2]+sl[i]);
        }

        return Math.max(dp1[0],dp2[1]);


    }
}