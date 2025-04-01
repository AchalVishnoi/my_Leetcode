class Solution {
    public long mostPoints(int[][] qs) {
        Long dp[]=new Long[qs.length];

        return max(qs,0,dp);

    }

    public long max(int[][]qs,int i,Long dp[]){
     if(i>=qs.length){
        return 0;
     }

     if(dp[i]!=null) return dp[i];

      long taken = qs[i][0]+max(qs,i+qs[i][1]+1,dp);
      long not=max(qs,i+1,dp);

     return dp[i]=Math.max(taken,not);
    }
}

