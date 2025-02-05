class Solution {
    public int integerReplacement(int n) {
        return solve((long) n);
    }

    public int solve(long n) {
        if (n == 1) return 0; 

        if ((n & (n - 1)) == 0) return (int) (Math.log(n) / Math.log(2));

        if ((n & 1) == 0) {
            return 1 + solve(n / 2); 
        } else {
            return 1 + Math.min(solve(n - 1), solve(n + 1));
        }
    }
}
