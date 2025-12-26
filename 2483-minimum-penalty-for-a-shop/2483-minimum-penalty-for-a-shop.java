class Solution {
    public int bestClosingTime(String s) {

        int n=s.length();
        int j=0;
        int min=0;
        int pan=0;

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='Y') pan++;
        }

        min=pan;
        j=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='Y')pan--;
            else pan++;

            
            if(pan<min){
              j=i+1;
              min=pan;
            }
        }

        return j;




        
    }
}