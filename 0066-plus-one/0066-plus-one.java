class Solution {
    public int[] plusOne(int[] d) {
        int n = d.length;
        int[] res = new int[n + 1];
        int carry = (d[n - 1] + 1) / 10;
        res[n] = (d[n - 1] + 1) % 10;

        for (int i = n - 2; i >= 0; i--) {
            res[i + 1] = (d[i] + carry) % 10;
            carry = (d[i] + carry) / 10;
        }

        if (carry > 0) {
            res[0] = carry;
            return res;
        }

        return Arrays.copyOfRange(res, 1, n + 1);
    }
}
