class Solution {
    public int[] xorQueries(int[] arr, int[][] q) {

        
        for(int i=1;i<arr.length;i++){
            arr[i]^=arr[i-1];
        }
        
        int ans[]=new int[q.length];
        for(int i=0;i<q.length;i++){
            if(q[i][0]==0) ans[i]=arr[q[i][1]];
            else ans[i]=arr[q[i][1]]^arr[q[i][0]-1];
        }
        return ans;
        
    }
}