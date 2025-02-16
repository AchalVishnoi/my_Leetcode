class Solution {
    public int[] constructDistancedSequence(int n) {
        int ans[] = new int[n * 2 - 1];
        make(ans, 0, new boolean[n], n);
        return ans;
    }

    public boolean make(int ans[], int i, boolean visi[], int n) {
        if (i >= ans.length) return true;

        if (ans[i] != 0) return make(ans, i + 1, visi, n);

        for (int j = n; j >= 1; j--) {
            if (!visi[j - 1]) {
                if (j == 1) { 
                  
                    visi[0] = true;
                    ans[i] = 1;
                    if (make(ans, i + 1, visi, n)) return true;
                    ans[i] = 0;
                    visi[0] = false;
                } else {
                  
                    if (i + j < ans.length && ans[i + j] == 0) { 
                        visi[j - 1] = true;
                        ans[i] = ans[i + j] = j;
                        if (make(ans, i + 1, visi, n)) return true;
                        ans[i] = ans[i + j] = 0; 
                        visi[j - 1] = false;
                    }
                }
            }
        }
        return false; 
    }
}
