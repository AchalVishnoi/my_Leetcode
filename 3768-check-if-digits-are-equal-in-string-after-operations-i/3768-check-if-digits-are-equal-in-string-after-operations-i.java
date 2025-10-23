class Solution {
    public boolean hasSameDigits(String s) {

        int n=s.length();
        StringBuilder st=new StringBuilder(s);
        while(st.length()>2){
            
            
            for(int i=0;i<st.length()-1;i++){
              int a=st.charAt(i)-'0';
              int b=st.charAt(i+1)-'0';
              st.setCharAt(i,(char)((a+b)%10+'0'));
            }
            st.deleteCharAt(st.length()-1);

            
            

           
            
        }
        return st.charAt(0)==st.charAt(1);
        
    }
}