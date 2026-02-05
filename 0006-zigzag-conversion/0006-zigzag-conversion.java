class Solution {
    public String convert(String s, int nr) {
        int n=s.length();
        if(n==1||nr==1) return s;


        int upper=2*nr-2;
        int lower=0;


        StringBuilder st=new StringBuilder();
        for(int i=0;i<nr;i++){
            boolean fl=true;
            int up=upper-2*i;
            int down=2*i;

            int j=i;
            while(j<n){
                st.append(s.charAt(j));
                if(fl){
                    if(up==0)j+=down;
                    else j+=up;
                } else {
                    if (down==0) j+=up;
                    else j+=down;
                }
                fl=!fl;
            }
            
        }

        return String.valueOf(st);


        
    }
}