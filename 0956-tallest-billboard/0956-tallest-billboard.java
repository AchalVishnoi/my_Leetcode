class Solution {
    int ans=0;
    int t[][];
    public int tallestBillboard(int[] rods) {


        int n=rods.length;
        t=new int[n+1][10001];

        for(int i=0;i<=10000;i++){
            t[n][i]= i==5000?0:Integer.MIN_VALUE/2;
        }

        for(int i=n-1;i>=0;i--){
            for(int diff=0;diff<=10000;diff++){
                t[i][diff]=t[i+1][diff];
                if(diff+rods[i]<=10000)
                t[i][diff]=Math.max(t[i][diff],t[i+1][diff+rods[i]]+rods[i]);

                if(diff-rods[i]>=0)
                t[i][diff]=Math.max(t[i][diff],t[i+1][diff-rods[i]]+rods[i]);
                
            }
        }


        return t[0][5000]/2;


        
    }

}