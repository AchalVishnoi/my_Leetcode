class Solution {
    public long maxMatrixSum(int[][] mat) {


        int min=Integer.MAX_VALUE;
        int cnt=0;

        long sum=0;
        for(int m[]:mat){
            for(int x:m){
               if(x>0) sum+=x;
               else{
                  cnt++;
                  sum+=Math.abs(x);
               }
               
                min=Math.min(Math.abs(x),min);
            }
        }


        if(cnt%2!=0){
            sum-=2*Math.abs(min);

        }


        return sum;

        
    }
}