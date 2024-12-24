class Solution {
    public String convert(String s, int numRows) {

        int n=s.length();

        if(s.length()<=numRows||numRows==1) return s;
        StringBuilder str=new StringBuilder();
        int upperJump,lowerJump;
        

        for(int i=1;i<=numRows;i++){
             lowerJump=(2*(numRows-i)-1+1);     //-1 coz last corner element added 2 times
             upperJump=(i-1)*2-1+1;

             int j=i-1;   //index when in numberd row
             int lowerJumpChance=1;
             int upperJumpChance=0;
             while(j<n){
                
                if(lowerJump==0) {
                    lowerJumpChance=0;
                     upperJumpChance=1;}

                if(upperJump==0){
                      lowerJumpChance=1;
                     upperJumpChance=0;
                }



                str.append(s.charAt(j));
                int jump;
                if(lowerJumpChance==1){
                   if(lowerJump!=0) j+=lowerJump;
                    lowerJumpChance=0;
                     upperJumpChance=1;

                }
                else{
                     if(upperJump!=0)j+=upperJump;
                    lowerJumpChance=1;
                     upperJumpChance=0;
                }

                    
                // if(lowerJump==0) upperJumpChance=1;
                // if(upperJump==0) lowerJumpChance=1;
               
              

             }



        }
        return String.valueOf(str);
        
    }
}