
class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int ans=0;
        int sign=1;
        int start=0;
        if(s.length()==0) return 0;
        if(s.charAt(0)=='-')
        {
            sign=-1;
            start=1;
        }
        if(s.charAt(0)=='+') start=1;
        int i=start;
     while(i<s.length()&&((s.charAt(i)-'0'>=0&&s.charAt(i)-'0'<10))){
        
             if (ans > (Integer.MAX_VALUE - (s.charAt(i)-'0')) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans=ans*10;
            ans+=(s.charAt(i)-'0');

            
        
        i++;
     }
     return sign*ans;
         

    }
}


// by java functio   //not working
/*
class Solution {
    public int myAtoi(String s) {
         
         s.trim();
         int sign=1;
         int start=0;
         if(s.charAt(0)=='-') {
            sign=-1;
            start++;
         }
         if(s.charAt(0)=='+'){
            sign=1;
            start++;
         }
          int ans=Integer.valueOf(s.substring(start));
          return ans*sign;

    }
}*/

