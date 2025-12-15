class Solution {
    int mod=1000000007;
    public int numSub(String s) {

        int n=s.length();
        long ans=0;
        long len=0;

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                len=(len+1)%mod;
                ans=(ans%mod+len%mod)%mod;
            }
            else len=0;
        }

        return (int) ans;


        
    }
}