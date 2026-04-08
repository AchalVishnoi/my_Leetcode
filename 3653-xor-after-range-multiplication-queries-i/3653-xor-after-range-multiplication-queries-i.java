class Solution {
    public int xorAfterQueries(int[] a, int[][] q) {
        int m = 1000000007;
        for (int[] x : q) {
            for (int i = x[0]; i <= x[1]; i += x[2]) {
                a[i] = (int)((1L * a[i] * x[3]) % m);
            }
        }
        int r = 0;
        for (int v : a) r ^= v;
        return r;
    }
}
