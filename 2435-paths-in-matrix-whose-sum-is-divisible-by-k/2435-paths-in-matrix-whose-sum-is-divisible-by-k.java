class Solution {
    int mod = 1000000007;

    public int numberOfPaths(int[][] grid, int k) {
        int[][][] dp = new int[grid.length][grid[0].length][k];
        for (int[][] a : dp)
            for (int[] b : a)
                Arrays.fill(b, -1);

        return solve(0, 0, grid, 0, k, dp);
    }

    public int solve(int i, int j, int[][] grid, int sum, int k, int[][][] dp) {
        int m = grid.length, n = grid[0].length;
        if (i >= m || j >= n) return 0;

        sum = (sum + grid[i][j]) % k;

        if (i == m - 1 && j == n - 1) {
            return sum == 0 ? 1 : 0;
        }

        if (dp[i][j][sum] != -1) return dp[i][j][sum];

        int down = solve(i + 1, j, grid, sum, k, dp);
        int right = solve(i, j + 1, grid, sum, k, dp);

        return dp[i][j][sum] = (down + right) % mod;
    }
}
