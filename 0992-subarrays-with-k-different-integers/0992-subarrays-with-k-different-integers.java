class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {

      return atmostk(nums,k)-atmostk(nums,k-1);
    }


    public int atmostk(int nums[],int k){


        int n=nums.length;
        Map<Integer,Integer> freq=new HashMap<>();
        int j=0;
        int ans=0;
        

        for(int i=0;i<n;i++){

            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);

            while(j<n&&freq.size()>k){
              
              if(freq.get(nums[j])==1) freq.remove(nums[j]);
              else freq.put(nums[j],freq.get(nums[j])-1);
              j++;


            }

            ans+=(i-j+1);


        }

       return ans; 




     
    }
}