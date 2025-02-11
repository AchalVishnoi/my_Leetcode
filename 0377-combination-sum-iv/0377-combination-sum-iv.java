class Solution {


    
    public int combinationSum4(int[] nums, int target) {

      int dp[]=new int[target+1];
      Arrays.fill(dp,-1);
       return comb(nums,target,dp) ;
    }




    private int comb(int[]num,int tar,int dp[]){
   if(tar==0) return 1;
   if(tar<0) return 0;
   if(dp[tar]!=-1) return dp[tar];

   int cnt=0;
   for(int i=0;i<num.length;i++){
     cnt+=comb(num,tar-num[i],dp);
   }
   
   
   return dp[tar]=cnt;
    }
}