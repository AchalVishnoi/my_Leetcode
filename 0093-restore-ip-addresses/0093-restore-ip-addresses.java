import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        backtrack(s, new StringBuilder(), 0, ans, 4);
        return ans;
    }

    public void backtrack(String s, StringBuilder str, int idx, List<String> l, int seg) {
        if (idx == s.length() && seg == 0) {
            str.deleteCharAt(str.length() - 1); 
            l.add(str.toString());
            return;
        }

        if (seg < 0 || idx >= s.length()) return;

        for (int i = 1; i <= 3 && idx + i <= s.length(); i++) {
            String part = s.substring(idx, idx + i);
            int num = Integer.parseInt(part);

            if (num > 255 || (part.length() > 1 && part.charAt(0) == '0')) break;

            int lenBef = str.length();
            str.append(part).append('.');

            backtrack(s, str, idx + i, l, seg - 1);

            str.setLength(lenBef);
        }
    }
}
