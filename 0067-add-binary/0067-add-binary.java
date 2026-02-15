class Solution {
    public String addBinary(String a, String b) {

        char carry='0';
        StringBuilder st=new StringBuilder();
        int n1=a.length();
        int n2=b.length();
        int i=n1-1;
        int j=n2-1;

        while(i>=0&&j>=0){
            char c1=a.charAt(i);
            char c2=b.charAt(j);
            int cnt1=0;
            if(c1=='1') cnt1++;
            if(c2=='1') cnt1++;
            if(carry=='1') cnt1++;
            if(cnt1==0){
                st.insert(0,'0');
                carry='0';
            }
            else if(cnt1==1){
                st.insert(0,'1');
                carry='0';
            }
            else if(cnt1==2){
                st.insert(0,'0');
                carry='1';
            }
            else{
                st.insert(0,'1');
                carry='1';  
            }
            i--;
            j--;
        }

        while (i >= 0) {
            int cnt = 0;
            if (a.charAt(i) == '1') cnt++;
            if (carry == '1') cnt++;

            if (cnt == 0) { st.insert(0, '0'); carry = '0'; }
            else if (cnt == 1) { st.insert(0, '1'); carry = '0'; }
            else { st.insert(0, '0'); carry = '1'; }

            i--;
        }

        
        while (j >= 0) {
            int cnt = 0;
            if (b.charAt(j) == '1') cnt++;
            if (carry == '1') cnt++;

            if (cnt == 0) { st.insert(0, '0'); carry = '0'; }
            else if (cnt == 1) { st.insert(0, '1'); carry = '0'; }
            else { st.insert(0, '0'); carry = '1'; }

            j--;
        }

        if (carry == '1') {
            st.insert(0, '1');
        }

        return st.toString();
        
    }
}