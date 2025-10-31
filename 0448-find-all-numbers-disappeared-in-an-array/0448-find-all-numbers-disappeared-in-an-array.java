class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int n=nums.length;
        for(int num:nums){

            int i=Math.abs(num)-1;
            nums[i]=-1*Math.abs(nums[i]);
        
        }

        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>0) l.add(i+1);
        }

        return l;
        
    }
}