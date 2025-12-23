class Solution {
    public int maxTwoEvents(int[][] ev) {

        Arrays.sort(ev,(a,b)->Integer.compare(a[1],b[1]));
        int st=Integer.MAX_VALUE;
        int end=Integer.MIN_VALUE;


        int n=ev.length;

        int best[]=new int[n];
        best[0]=ev[0][2];
        for(int i=1;i<n;i++){
            best[i]=Math.max(best[i-1],ev[i][2]);
        } 

        int ans=best[0];

        for(int i=0;i<n;i++){
          
          int idx=findIdx(ev,ev[i][0]);
          int val=ev[i][2];
          if(idx>=0){
            val+=best[idx];
          }

          ans=Math.max(val,ans);


        }





     return ans;

    }

    private int findIdx(int ev[][],int st){
        int l=0;
        int r=ev.length-1;
        int res=-1;
        while(r>=l){
           int mid=(r-l)/2+l;
           if(ev[mid][1]<st){
            res=mid;
            l=mid+1;
           }
           else r=mid-1;
        }

        return res;
    }
}