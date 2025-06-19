import java.util.*;

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> ans = new ArrayList<>();
        Set<String> dict = new HashSet<>(wordDict);
        construct(s, new StringBuilder(), ans, dict, 0);
        return ans;
    }

    public void construct(String s, StringBuilder str, List<String> ans, Set<String> dict, int i) {
        if (i >= s.length()) {
            ans.add(str.toString().trim());
            return;  
        }

        for (int j = i + 1; j <= s.length(); j++) {
            String sub = s.substring(i, j);
            if (dict.contains(sub)) {
                int start = str.length();
                str.append(sub).append(" ");
                
                construct(s, str, ans, dict, j);
                
                str.delete(start, str.length());
            }
        }
    }
}
