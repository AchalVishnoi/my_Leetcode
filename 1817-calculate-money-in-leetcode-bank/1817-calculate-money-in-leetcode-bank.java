class Solution {
    public int totalMoney(int n) {

        int a = n / 7;
        int ans = 0;

        for (int i = 0; i < a; i++) {
            ans += 28 + 7 * i; 
        }

        int i = a + 1;
        int cnt = 0;
        while (cnt < n % 7) {
            ans += i;
            i++;
            cnt++;
        }

        return ans;
    }
}
