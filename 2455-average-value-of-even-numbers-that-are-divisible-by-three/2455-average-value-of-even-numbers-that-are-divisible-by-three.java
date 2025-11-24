class Solution {
    public int averageValue(int[] nums) {
        int n=0;
        int sum=0;
        for(int x:nums){
            if(x%6==0){
                sum+=x;
                n++;
            }
        }

        if(n==0) return 0;

        return sum/n;
    }
}