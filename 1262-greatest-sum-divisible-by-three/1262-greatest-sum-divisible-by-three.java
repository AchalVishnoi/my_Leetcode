class Solution {
    public int maxSumDivThree(int[] nums) {

        int n=nums.length;
        int a[]=new int[]{0,Integer.MIN_VALUE,Integer.MIN_VALUE};
        for(int i=0;i<n;i++){
            int k=nums[i]%3;
            int prev[]=Arrays.copyOf(a,3);

            if(k==0){
                a[0]=prev[0]+nums[i];
                a[1]=prev[1]+nums[i];
                a[2]=prev[2]+nums[i];
            }
            else if(k==1){
                a[0]=Math.max(a[0],prev[2]+nums[i]);
                a[1]=Math.max(a[1],prev[0]+nums[i]);
                a[2]=Math.max(a[2],prev[1]+nums[i]);
            }
            else{
                a[0]=Math.max(a[0],prev[1]+nums[i]);
                a[1]=Math.max(a[1],prev[2]+nums[i]);
                a[2]=Math.max(a[2],prev[0]+nums[i]);
            }
            
            
        }

        return a[0];
        
    }
}