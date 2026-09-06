class Solution {
    public int numberOfUniqueGoodSubsequences(String bin) {

        int n=bin.length();
        int d1=0;
        int d0=0;

        int mod=1000000007;
        boolean hasZero=false;
        for(int i=0;i<n;i++){
            char c=bin.charAt(i);
            if(c=='1'){
                d1=((d0+d1)%mod+1)%mod;
            }
            else{
                hasZero=true;
                d0=(d1+d0)%mod;
            }
        }

        return ((d1+d0)%mod+(hasZero?1:0))%mod;
    }
}