import java.util.*;

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> result = new ArrayList<>();

        Map<String, Integer> order = new HashMap<>();
        order.put("electronics", 0);
        order.put("grocery", 1);
        order.put("pharmacy", 2);
        order.put("restaurant", 3);

        List<String[]> valid = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {
            if (checkCode(code[i]) && checkBus(businessLine[i]) && isActive[i]) {
                valid.add(new String[]{businessLine[i], code[i]});
            }
        }

        Collections.sort(valid, (a, b) -> {
            int cmp = Integer.compare(order.get(a[0]), order.get(b[0]));
            if (cmp == 0) {
                return a[1].compareTo(b[1]);
            }
            return cmp;
        });

        for (String[] v : valid) {
            result.add(v[1]);
        }

        return result;
    }

    public boolean checkCode(String s) {
        if (s == null || s.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'A' && c <= 'Z') ||
                (c >= 'a' && c <= 'z') ||
                (c >= '0' && c <= '9') ||
                c == '_') {
                continue;
            }
            return false;
        }
        return true;
    }

    public boolean checkBus(String s) {
        return s.equals("electronics") || s.equals("grocery")
            || s.equals("pharmacy") || s.equals("restaurant");
    }
}
