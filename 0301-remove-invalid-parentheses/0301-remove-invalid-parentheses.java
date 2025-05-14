class Solution {
    int min=0;
    public List<String> removeInvalidParentheses(String s) {

    HashMap<Integer, Set<String>> ansMap = new HashMap<>();

    ansMap.put(min,new HashSet<>());

    solve(new Stack<>(),s,0,new StringBuilder(),ansMap);

    return new ArrayList<>(ansMap.get(min));
       
        
    }

public void solve(Stack<Character> st, String s, int idx, StringBuilder str, HashMap<Integer, Set<String>> ansMap) {

    int originalLength = str.length(); 
    while (idx < s.length() && s.charAt(idx) != '(' && s.charAt(idx) != ')') {
        str.append(s.charAt(idx));
        idx++;
    }

    if (idx >= s.length()) {
        if (st.isEmpty()) {
            Set<String> l = ansMap.getOrDefault(str.length(), new HashSet<>());
            l.add(str.toString());
            ansMap.put(str.length(), l);
            min = Math.max(min, str.length());
        }
        str.setLength(originalLength);
        return;
    }

    char current = s.charAt(idx);

    if (current == '(') {
       
        st.push(current);
        str.append(current);
        solve(st, s, idx + 1, str, ansMap);
        str.deleteCharAt(str.length() - 1);
        st.pop(); 
        
    } else if (current == ')') {
        
        if (!st.isEmpty() && st.peek() == '(') {
            char popped = st.pop();
            str.append(current);
            solve(st, s, idx + 1, str, ansMap);
            str.deleteCharAt(str.length() - 1);
            st.push(popped);  
        }
    }

   
    solve(st, s, idx + 1, str, ansMap);

    str.setLength(originalLength); 
}

}