class Solution {
    public long maxProfit(int[] p, int[] st, int k) {

        int n=p.length;

        long winr=0;
        long pr=0;
        long winp=0;
        for(int i=0;i<k/2;i++){
           winp+=p[i]*st[i];
           pr+=p[i]*st[i];
        }
        for(int i=k/2;i<k;i++){
           winp+=p[i]*st[i];
           pr+=p[i]*st[i]; 
           winr+=p[i];          
        }

        long best=winr-winp;
        for(int i=1;i<=n-k;i++){

           winp-=(p[i-1]*st[i-1]);
           winp+=(p[i+k-1]*st[i+k-1]);
           pr+=p[i+k-1]*st[i+k-1];

           winr-=(p[i+k/2-1]);
           winr+=(p[i+k-1]);
           best=Math.max(winr-winp,best);


        }

        return Math.max(pr,pr+best);

        
    }
}