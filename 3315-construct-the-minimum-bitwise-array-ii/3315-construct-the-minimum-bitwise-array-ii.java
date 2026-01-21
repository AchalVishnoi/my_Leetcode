class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();

        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int x=nums.get(i);
            if(x%2==0){
                ans[i]=-1;
            }
            else{
                int k=x^(x+1);
                ans[i]=((k+1)>>2)^x;

            }
        }

        return ans;
    }
}