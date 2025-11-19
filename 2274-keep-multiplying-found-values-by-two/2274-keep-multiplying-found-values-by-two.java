class Solution {
    public int findFinalValue(int[] nums, int o) {

        int n=nums.length; 
        boolean f[]=new boolean[32];
        
        for(int i:nums){
            int j=0;
            while(i>(o<<j)) j++;
            if(i==(o<<j)) f[j]=true;

        }

        int i=0;
        while(i<32){
            if(f[i]) i++;
            else break;
        }

        return o<<i;



        
    }
}