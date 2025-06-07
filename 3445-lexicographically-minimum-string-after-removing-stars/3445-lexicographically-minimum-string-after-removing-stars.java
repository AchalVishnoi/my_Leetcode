class Solution {
    public String clearStars(String s) {

        int n = s.length();
        boolean keep[] = new boolean[n];
        Arrays.fill(keep, true);

        HashMap<Character, List<Integer>> h = new HashMap<>();
        int i = 0;

        PriorityQueue<Character> pq = new PriorityQueue<>();
        StringBuilder res = new StringBuilder();

        i = 0;
        for (Character c : s.toCharArray()) {
            if (c != '*') {
                pq.add(c);
                List<Integer> l = h.getOrDefault(c, new ArrayList<>());
                l.add(i);
                h.put(c, l);
            } else {
                while (!pq.isEmpty()) { // Skip already removed ones
                keep[i]=false;
                    char t = pq.poll();
                    List<Integer> list = h.get(t);
                    if (list != null && !list.isEmpty()) {
                        int j = list.remove(list.size() - 1);
                        keep[j] = false;
                        break;
                    }
                }
            }
            i++;
        }

        for (int j = 0; j < n; j++) {
            if (keep[j]) res.append(s.charAt(j));
        }

        return res.toString();  
    }
}
