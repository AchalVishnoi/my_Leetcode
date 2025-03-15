import java.util.HashMap;

class Solution {
    
    public int countDigitOne(int n) {
        return f(n);
    }

    public int f(int n) {
        if (n == 0) return 0;

        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(9, 1);

        for (int i = 9; i <= 99999999; i = i * 10 + 9) {
            mp.put(i * 10 + 9, mp.get(i) * 10 + i + 1);
        }

        int nn = n, div = 1;
        while (nn / 10 != 0) {
            nn /= 10;
            div *= 10;
        }

        int ans = (n / div) * mp.getOrDefault(div - 1, 0);
        ans += (n / div > 1) ? div : 0;
        ans += (n / div == 1) ? n % div + 1 : 0;
        ans += f(n % div);

        return ans;
    }
}
