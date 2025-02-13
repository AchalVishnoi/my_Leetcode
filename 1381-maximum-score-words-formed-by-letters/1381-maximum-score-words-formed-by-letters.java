class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] frq = new int[26];

        for (char c : letters) {
            frq[c - 'a']++;
        }

        return findMax(words, frq, score, 0, 0);
    }

    private int findMax(String[] words, int[] frq, int[] scr, int idx, int curScr) {
        if (idx >= words.length) {
            return curScr;
        }

        int maxScr = findMax(words, frq, scr, idx + 1, curScr);

        String w = words[idx];
        int[] wFrq = new int[26];
        boolean canUse = true;
        int wScr = 0;

        for (char c : w.toCharArray()) {
            int i = c - 'a';
            wFrq[i]++;
            if (wFrq[i] > frq[i]) {
                canUse = false;
                break;
            }
            wScr += scr[i];
        }

        if (canUse) {
            for (char c : w.toCharArray()) frq[c - 'a']--;

            maxScr = Math.max(maxScr, findMax(words, frq, scr, idx + 1, curScr + wScr));

            for (char c : w.toCharArray()) frq[c - 'a']++;
        }

        return maxScr;
    }
}
