class Solution {
    int mod = 1_000_000_007;  

    public int monkeyMove(int n) {
        return (pow(2, n) - 2 + mod) % mod; 
    }

    public int pow(int base, int exp) {
        if (exp == 0) return 1;

        long half = pow(base, exp / 2);
        half = (half * half) % mod;
        if (exp % 2 != 0) {
            half = (half * base) % mod; 
        }

        return (int) half;
    }
}
