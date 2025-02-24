class Solution {
    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        int n = amount.length;
        List<List<Integer>> tree = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            tree.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            tree.get(edge[0]).add(edge[1]);
            tree.get(edge[1]).add(edge[0]);
        }

       
        boolean visi[] = new boolean[n];

        int time[] = new int[n];
        Arrays.fill(time, Integer.MAX_VALUE);
        findTime(tree, bob, visi, time, 0); 

        Arrays.fill(visi, false);
        return dfs(tree, 0, visi, time, 0, amount);
    }

    public boolean findTime(List<List<Integer>> tree, int curr, boolean visi[], int time[], int tim) {
        visi[curr] = true; 
        time[curr] = tim;

        if (curr == 0) {
            return true;
        }

        for (int nough : tree.get(curr)) {
            if (!visi[nough]) { 
                if (findTime(tree, nough, visi, time, tim + 1)) {
                    return true;
                }
            }
        }
      time[curr]= Integer.MAX_VALUE;
        return false;
    }

    public int dfs(List<List<Integer>> tree, int curr, boolean visi[], int time[], int tim, int amt[]) {
        visi[curr] = true;

        int alicAmt;
        if (tim == time[curr]) {
            alicAmt = amt[curr] / 2;
        } else if (tim < time[curr]) {
            alicAmt = amt[curr];
        } else {
            alicAmt = 0;
        }

        boolean isLeaf = true;
        int max = Integer.MIN_VALUE;

        for (int nough : tree.get(curr)) {
            if (!visi[nough]) {
                isLeaf = false;
                max = Math.max(max, dfs(tree, nough, visi, time, tim + 1, amt));
            }
        }

        return isLeaf ? alicAmt : alicAmt + max;
    }
}
