class Solution {
    public boolean checkOnesSegment(String s) {

        for(int i=s.length()-2;i>=0;i--){
            if(s.charAt(i)=='0'&&s.charAt(i+1)=='1') return false;
        }

        return true;
        
    }
}