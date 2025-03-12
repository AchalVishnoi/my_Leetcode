class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int mid=(i+j)/2;
            if(nums[mid]>0){
                j=mid;
            }
            else if(nums[mid]<0) i=mid+1;
            else {
                i=mid;
                j=mid;
            }
        }

        int ans=0;
        int pos=0,neg=0;

        if(nums[j]<0){

            neg=j+1;
            while (j + 1 < n && nums[j + 1] == 0) {
                j++;
            }
            pos = n - j - 1;
       
     


        }

        else if(nums[j]>0){
            pos = n - j;
            while (j - 1 >= 0 && nums[j - 1] == 0) {
                j--;
            }
            neg = j;
       

        }
        else{

            int t = j;
            while (j + 1 < n && nums[j + 1] == 0) {
                j++;
            }
            pos = n - j - 1;
            j = t;
            while (j - 1 >= 0 && nums[j - 1] == 0) {
                j--;
            }
            neg = j;

        }


        return Math.max(pos,neg);
        
    }
}