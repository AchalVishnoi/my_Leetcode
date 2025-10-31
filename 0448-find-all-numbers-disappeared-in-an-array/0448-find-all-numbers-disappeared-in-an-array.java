class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int n=nums.length;
        for(int i=0;i<n;i++){
            while(nums[i]!=nums[nums[i]-1]){
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }

        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1) l.add(i+1);
        }

        return l;
        
    }
}