class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] notp = sieve(right);

        int lastPrime = -1;
        int minDiff = Integer.MAX_VALUE;
        int[] result = {-1, -1};

     
        for (int i = left; i <= right; i++) {
            if (!notp[i]) {
                if (lastPrime != -1 && i - lastPrime < minDiff) {
                    result[0] = lastPrime;
                    result[1] = i;
                    minDiff = i - lastPrime;
                }
                lastPrime = i;
            }
        }

        return result;
    }

    public boolean[] sieve(int right) {
        boolean[] notp = new boolean[right + 1];
        notp[0] = notp[1] = true; 

        for (int i = 2; i * i <= right; i++) {
            if (!notp[i]) {
                for (int j = i * i; j <= right; j += i) {
                    notp[j] = true;
                }
            }
        }

        return notp;
    }
}
