class Solution {
    public int mostBooked(int n, int[][] mtgs) {

     int cnt[]=new int[n];
     long busy[]=new long[n];

     Arrays.sort(mtgs,(a,b)->Integer.compare(a[0],b[0]));

     for(int mtg[]:mtgs){

        long erlst=Long.MAX_VALUE;
        int idx=-1;

        boolean flag=false;

        for(int i=0;i<n;i++){

            if(busy[i]<erlst){
                erlst=busy[i];
                idx=i;
            }

            if(busy[i]<=mtg[0]){

                busy[i]=mtg[1];
                cnt[i]++;
                flag=true;
                break;

            }






        }

        if(!flag){
            busy[idx]+=(mtg[1]-mtg[0]);
            cnt[idx]++;
        }








     }

     int res=0;
     int max=cnt[0];

     for(int i=1;i<n;i++){
        if(max<cnt[i]){
            max=cnt[i];
            res=i;
        }
     }

     return res;
        
    }
}