class Solution {
    public int minimumMountainRemovals(int[] nums) {

        int n=nums.length;
        int lis[]=new int[n];
        lis[0]=1;

        for(int i=1;i<n;i++){
            lis[i]=1;
            for(int j=0;j<i;j++){
              if(nums[j]<nums[i]) lis[i]=Math.max(lis[j]+1,lis[i]);
            }
        }


        int lds[]=new int[n];

        lds[n-1]=1;

        int max=0;

        for(int i=n-2;i>=0;i--){
            lds[i]=1;
            for(int j=n-1;j>i;j--){
              if(nums[j]<nums[i]) lds[i]=Math.max(lds[j]+1,lds[i]);
            }
            
            if(lis[i]>1&&lds[i]>1)max=Math.max(lis[i]+lds[i]-1,max);

        }



        return n-max;
        



        
    }
}