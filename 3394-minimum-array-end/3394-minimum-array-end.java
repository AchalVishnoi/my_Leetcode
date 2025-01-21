class Solution {
    public long minEnd(int n, int x) {
      

    
    //bit wise solution
      int cnt=0;
      int idx=0;

      for(int i=31;i>=0;i--){
        if(((1<<i)&(n-1))!=0){
            cnt=i;
            break;
        }
      }
      long ans=x;
      
      for(int i=0;i<=63;i++){
       if ((x & (1L << i)) == 0) { 
                if (((n - 1) & (1L << idx)) != 0) {
                    ans |= (1L << i);
                }
                idx++;
        }
      }

      return ans;



/* // basic solution
      
  long prev=x;
    while((--n)>0){
       prev=((prev+1)|x);

    }

      return  prev;*/
  }
}
