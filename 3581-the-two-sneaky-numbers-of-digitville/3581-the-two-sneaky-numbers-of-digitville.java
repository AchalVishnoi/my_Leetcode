class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        int n=nums.length;
        Arrays.sort(nums);
        int a[]=new int[2];
        int j=0;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                a[j++]=nums[i];
            }
            if(j==2) break;
        }
        

        return a;
    }
}