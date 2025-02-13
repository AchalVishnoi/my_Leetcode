import java.util.*;

class Solution {
    public int maxUniqueSplit(String s) {
        return search(s, new HashSet<>(), 0);
    }

    public int search(String s, Set<String> str, int i) {
        if (i >= s.length()) {
            return str.size();
        }

        int max = -1;

        for (int j = i + 1; j <= s.length(); j++) {
            String sub = s.substring(i, j);

            if (!str.contains(sub)) {
                str.add(sub);
                max = Math.max(search(s, str, j), max);
                str.remove(sub);
            }
        }

        return max;
    }
}
