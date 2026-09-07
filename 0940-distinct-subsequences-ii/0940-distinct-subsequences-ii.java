class Solution {
    
    public int distinctSubseqII(String s) {

        long cnt[]=new long[26];
        int n=s.length();
        int mod=1000000007;
        for(int i=0;i<n;i++){
            int x=s.charAt(i)-'a';
            long tot=0;
            for(int j=0;j<26;j++){
                tot=(tot+cnt[j])%mod;
            }
            cnt[x]=(tot+1)%mod;
        }

        long ans=0;

        for(int i=0;i<26;i++){
            ans=(ans+cnt[i])%mod;
        }

        return (int)ans;
    }
}