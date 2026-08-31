class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int j=0;
        for(int i=0;i<n;i++){
            j=Math.max(piles[i],j);
        }
        int i=1;
        int k=-1;

        while(i<=j){
            int mid=i+(j-i)/2;
            if(isPossible(piles,h,mid)){
                k=mid;
                j=mid-1;
            }
            else i=mid+1;
        }

        return k;

    }
    private boolean isPossible(int piles[],int h,int k){
        int t=0;
        for(int x:piles){
            t+=((x+k-1) / k);
            if(t>h) return false;
        }

        return true;
        
    }
}