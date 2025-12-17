class Solution {
    Long t[][][];
    public long maximumProfit(int[] p, int k) {

        int n=p.length;
        t=new Long[n+1][k+1][3];

        for(int i=0;i<=n;i++){
            t[i][0][0]=0L;
            t[i][0][1]=(long)Integer.MIN_VALUE;
            t[i][0][2]=(long)Integer.MIN_VALUE;
        }

        for(int i=0;i<=k;i++){
            t[n][i][0]=0L;
            t[n][i][1]=(long)Integer.MIN_VALUE;
            t[n][i][2]=(long)Integer.MIN_VALUE;
        }

        for(int i=n-1;i>=0;i--){
            for(int j=1;j<=k;j++){
                for(int c=0;c<3;c++){
                    long take;
                    if(c==2){
                        take=-p[i]+t[i+1][j-1][0];
                    }
                    else if(c==1){
                        take=p[i]+t[i+1][j-1][0];
                    }
                    else{
                        take=Math.max(-p[i]+t[i+1][j][1],p[i]+t[i+1][j][2]);
                    }

                    long notTake=t[i+1][j][c];

                    t[i][j][c]=Math.max(take,notTake);
                }
            }
        }


        return t[0][k][0];





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