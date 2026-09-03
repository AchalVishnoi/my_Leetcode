class Solution {
    public int arrangeCoins(int n) {
        int ans=0;
        int i=0;
        int j=n;
        while(i<=j){
            int mid=i+(j-i)/2;
            long cnt=mid*(mid+1L)/2;
            if(cnt<=n){
                ans=mid;
                i=mid+1;
            }
            else j=mid-1;
        }

        return ans;
    }
}