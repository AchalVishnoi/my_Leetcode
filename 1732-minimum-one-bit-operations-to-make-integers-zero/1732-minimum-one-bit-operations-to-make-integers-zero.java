class Solution {
    public int minimumOneBitOperations(int n) {
     
      int step=1;
      int ans=0;
     for(int i=31;i>=0;i--){
        
        if(((1<<i)&n)!=0){
             ans+=step*opTo0(i);
             step*=-1;
        }
        


     }
     return ans;

    
}

     
     public int opTo0(int set){
        if(set==0) return 1;
       else return 2*opTo0(set-1)+1;

     }




}