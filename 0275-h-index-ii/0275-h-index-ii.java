class Solution {
    public int hIndex(int[] c) {

        int n=c.length;
        int i=0;
        int j=n-1;
        int ans=0;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(n-mid<=c[mid]){
                ans=n-mid;
                j=mid-1;
            }
            else i=mid+1;
        }

        return ans;
        
    }
}