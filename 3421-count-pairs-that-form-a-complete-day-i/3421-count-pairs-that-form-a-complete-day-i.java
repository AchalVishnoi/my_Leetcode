class Solution {
    public int countCompleteDayPairs(int[] hrs) {
        int[] a = new int[24];
        int ans = 0;

        for (int hour : hrs) {
            a[hour % 24]++;
        }

        ans += (a[0] * (a[0] - 1)) / 2;  // Pairs among 0
        ans += (a[12] * (a[12] - 1)) / 2; // Pairs among 12

        int i = 1, j = 23;
        while (i < j) {
            ans +=  a[i] * a[j]; // Pairs between i and j
            i++;
            j--;
        }

        return ans;
    }
    }
