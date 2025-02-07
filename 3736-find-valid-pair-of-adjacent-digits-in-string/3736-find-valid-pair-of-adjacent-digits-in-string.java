import java.util.HashMap;

class Solution {
    public String findValidPair(String s) {
        int n = s.length();
        String ans = "";
        HashMap<Character, Integer> h = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            h.put(c, h.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < n - 1; i++) {
            char fi = s.charAt(i);
            char se = s.charAt(i + 1);

            if (fi != se && h.get(fi) == fi - '0' && h.get(se) == se - '0') {
                return "" + fi + se;
            }
        }

        return "";
    }
}

