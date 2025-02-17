class Solution {
    public boolean isValidSudoku(char[][] b) {




        // to check row and col

        
        for(int i=0;i<9;i++){
            Set <Character> s=new HashSet<>();

            for( int j=0;j<9;j++){
               
               if(b[i][j]!='.'){
                if(s.contains(b[i][j])) return false;
                s.add(b[i][j]);
               }
            }

        }


        
        for(int i=0;i<9;i++){
            Set <Character> s=new HashSet<>();

            for( int j=0;j<9;j++){
               
               if(b[j][i]!='.'){
                if(s.contains(b[j][i])) return false;
                s.add(b[j][i]);
               }
            }

        }




       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
         
         int strow=i*3,endrow=(i+1)*3-1,stcol=j*3, endcol=(j+1)*3-1;
           Set <Character> s=new HashSet<>();
         for(int r=strow;r<=endrow;r++){
            for(int c=stcol;c<=endcol;c++){
              if(b[r][c]!='.'){
                if(s.contains(b[r][c])) return false;
                s.add(b[r][c]);
               }
            }
         }




        }
       }




   return true;
        
    }
}