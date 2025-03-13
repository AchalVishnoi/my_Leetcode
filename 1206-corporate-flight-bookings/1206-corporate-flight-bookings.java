class Solution {                       //bookings 
    public int[] corpFlightBookings(int[][] b,          int n) {

        int diff[]=new int[n];
        for(int i=0;i<b.length;i++){
            diff[b[i][0]-1]+=b[i][2];
            if(b[i][1]<n) diff[b[i][1]]-=b[i][2];
        }
        for(int i=1;i<n;i++){
            diff[i]+=diff[i-1];
        }




     return diff;    
    }
}