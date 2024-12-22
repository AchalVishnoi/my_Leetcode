class Solution {
    public int romanToInt(String s) {

        HashMap<Character,Integer> m=new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int n=s.length();

           int ans=m.get(s.charAt(n-1));
        
        for(int i=n-2;i>=0;i--){
            char c=s.charAt(i);

            if(m.get(c)>=m.get(s.charAt(i+1))){
                ans+=m.get(c);
            }
            else{
                  ans-=m.get(c);
            }
        }

        return ans;
        
    }
}