class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> l=new ArrayList<>();
        for(int num:nums){

            int i=Math.abs(num)-1;
            if(nums[i]<0) l.add(i+1);
            else nums[i]= -nums[i];
            
        }

        return l;
        
    }
}