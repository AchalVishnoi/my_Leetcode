class Solution {
    public int beautifulSubsets(int[] nums, int k) {


        Arrays.sort(nums);

        return back(nums,k,0,new HashSet<>())-1;
        
    }

    public int back(int nums[],int k,int j,HashSet<Integer> hs){

        if(j>=nums.length) return 1;
       
    
    int cnt=back(nums,k,j+1,hs);
    if(!hs.contains(nums[j]-k)){
        hs.add(nums[j]);
        cnt+=back(nums,k,j+1,hs);
        hs.remove(nums[j]);

    }


    return cnt;


    }
}