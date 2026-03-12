class Solution {
    public long minimumTime(int[] time, int tot) {

        long i=0;
        long j=1L*time[0]*tot;

        while(j>i){

            long mid=i+(j-i)/2;
            long trip=findTrip(time,mid);
            if(trip<tot){
                i=mid+1;
            }
            else j=mid;

        }

        return j;

        
    }
    private long findTrip(int time[],long t){
        
        long ans=0;
        for(int x:time){
           ans+=(t/x);
        }

        return ans;
    }
}