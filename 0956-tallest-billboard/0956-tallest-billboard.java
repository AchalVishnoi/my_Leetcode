class Solution {
    int ans=0;
    Integer t[][];
    public int tallestBillboard(int[] rods) {

        t=new Integer[21][10001];

        return find(rods,0,5000)/2;
        
    }
    public int find(int []rod,int i,int diff){

     if(i>=rod.length){
        if(diff==5000) return 0;
        return Integer.MIN_VALUE;
     }   

     if(t[i][diff]!=null) return t[i][diff];


     

     int notTake=find(rod,i+1,diff);
     int take=Math.max(find(rod,i+1,diff+rod[i]),find(rod,i+1,diff-rod[i]))+rod[i];

     return  t[i][diff]= Math.max(notTake,take);
      



    }
}