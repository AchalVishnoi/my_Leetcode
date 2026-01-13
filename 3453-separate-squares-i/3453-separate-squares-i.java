class Solution {
    public double separateSquares(int[][] sq) {

        double ymax=0;
        double ymin=0;
        for(int a[]:sq) ymax=Math.max(ymax,a[1]+a[2]);
        double ans=-1;

        while(ymax-ymin>=1e-6){
          
          double y0=ymin+(ymax-ymin)/2;
          double a[]=divideArray(sq,y0);
          
          if(a[0]<a[1]){
            ymin=y0;
          }
          else ymax=y0;



        }

        return ymin;
        
    }

    private double[] divideArray(int s[][],double y0){

        double a1=0;
        double a2=0;
        for(int []a:s){
            int x=a[0];
            int y=a[1];
            int l=a[2];
            if(y+l<=y0) a1+=(1L*l*l);
            else if(y>=y0) a2+=(double)l*l;
            else{
                a1+=1L*(y0-y)*l;
                a2+=(double)(y+l-y0)*l;
            }


        }

        return new double[]{a1,a2};

    }
}