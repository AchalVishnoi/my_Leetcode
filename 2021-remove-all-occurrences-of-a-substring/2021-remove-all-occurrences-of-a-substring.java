/*using stack
class Solution {
    public String removeOccurrences(String s, String part) {


        Stack <Character> st=new Stack<>();
        for(int j=0;j<s.length();j++){
            st.push(s.charAt(j));
            if(st.size()>=part.length()){
                Stack<Character> q=new Stack<>();
                int i=part.length()-1;
                while(i>=0&&st.peek()==part.charAt(i)){
                    q.push(st.pop());
                    i--;
                }
                if(i>=0)
                while(!q.isEmpty()){
                    st.push(q.pop());
                }
            }
        }


        StringBuilder str=new StringBuilder();
        while(!st.isEmpty()){
            str.insert(0,st.pop());
        }
      return str.toString();  
    }
}*/

class Solution {
    public String removeOccurrences(String s, String part) {
        List<Character> st = new ArrayList<>();
        int partLen = part.length();

        for (char ch : s.toCharArray()) {
            st.add(ch);

          
            if (st.size() >= partLen) {
                boolean isMatch = true;
                for (int i = 0; i < partLen; i++) {
                    if (st.get(st.size() - partLen + i) != part.charAt(i)) {
                        isMatch = false;
                        break;
                    }
                }
             
                if (isMatch) {
                    for (int i = 0; i < partLen; i++) {
                        st.remove(st.size() - 1);
                    }
                }
            }
        }
        
        StringBuilder result = new StringBuilder(st.size());
        for (char ch : st) {
            result.append(ch);
        }
        return result.toString();
    }
}
