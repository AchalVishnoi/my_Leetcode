class Solution {
    public String countAndSay(int n) {
        return count(n);
    }

    public String count(int n) {
        if (n == 1) {
            return "1";
        }

        String s = count(n - 1);
        StringBuilder str = new StringBuilder();

        char prev = s.charAt(0);
        int cnt = 1;

        for (int i = 1; i < s.length(); i++) {
            if (prev != s.charAt(i)) {
                str.append(cnt).append(prev); 
                prev = s.charAt(i);
                cnt = 1;
            } else {
                cnt++;
            }
        }

        str.append(cnt).append(prev); 
        return str.toString();
    }
}
