class Solution {
    public int minPartitions(String s) {

        for(int i=9;i>=0;i--){
            if(s.contains(i+"")) return i;
        }

        return 0;
        


        
    }
}