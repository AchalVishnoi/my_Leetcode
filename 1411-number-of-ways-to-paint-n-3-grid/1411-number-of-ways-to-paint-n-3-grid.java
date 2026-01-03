class Solution {
    int mod=(int)1e9+7;
    public int numOfWays(int n) {



     long t1=6;
     long t2=6;
     for(int i=1;i<n;i++){

        long a=(t1*3+t2*2)%mod;
        long b=(t2*2+t1*2)%mod;
        t1=a;
        t2=b;
     }

     return (int)((t1+t2)%mod);
 



    }
}