class Solution {
    public int minBitFlips(int start, int goal) {

   

        int n=start^goal;
        //count number of 1
        int ans=0;
        while(n!=0){
            n=n&(n-1);
            ans++;
        }

        return ans;

     
         



    }
}