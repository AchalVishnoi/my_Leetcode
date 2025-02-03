class Solution {
    public int maxFreeTime(int et, int k, int[] st, int[] ent) {

        int spac[] = new int[st.length + 1];
        spac[0] = st[0]; 

        for (int i = 1; i < st.length; i++) {
            spac[i] = st[i] - ent[i - 1];
        }

        spac[st.length] = et - ent[st.length - 1];

        int n = st.length + 1;
        int cnt = 0, j = 0;
        int ans = spac[0];
        int an = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            ans += spac[i];
            cnt++;

            while (cnt >= k && j <= i) {
                an = Math.max(an, ans);
                ans -= spac[j];
                j++;
                cnt--;
            }
        }

        return an; 
    }
}
