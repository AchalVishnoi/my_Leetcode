class Solution {
    
    public int distinctSubseqII(String s) {

        long cnt[] = new long[26];
        long total = 0;
        int mod = 1000000007;

        for (char ch : s.toCharArray()) {

            int x = ch - 'a';

            long old = cnt[x];

            cnt[x] = (total + 1) % mod;

            total = (total + cnt[x] - old + mod) % mod;
        }

        return (int) total;
    }
}