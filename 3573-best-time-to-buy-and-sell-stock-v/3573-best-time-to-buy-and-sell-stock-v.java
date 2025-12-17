class Solution {
    Long t[][][];
    public long maximumProfit(int[] p, int k) {

        int n=p.length;
        t=new Long[n][k+1][3];

        return find(p,0,k,0);


    }

    public long find(int []p,int i,int k,int Case){


        if(i>=p.length||k==0){
            if(Case==0) return 0;
            return Integer.MIN_VALUE;
        }

        if(t[i][k][Case]!=null) return t[i][k][Case];

        

       long take;
       if(Case==2){
        take=-p[i]+find(p,i+1,k-1,0);
       }
       else if(Case==1){
        take=p[i]+find(p,i+1,k-1,0);
       }
       else{
        take=Math.max(-p[i]+find(p,i+1,k,1),
                    p[i]+find(p,i+1,k,2));
       }


       long notTake=find(p,i+1,k,Case);

       return t[i][k][Case]=Math.max(take,notTake);

       






    }
}