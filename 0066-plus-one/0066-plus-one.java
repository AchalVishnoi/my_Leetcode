class Solution {
    public int[] plusOne(int[] dig) {
     


     int n=dig.length;
     int ans[]=new int [n+1];
     int crr=(dig[n-1]+1)/10;
     ans[n]=(dig[n-1]+1)%10;
     int i=n-1;
     while(i>=1){
        ans[i]=(dig[i-1]+crr)%10;
         crr=(dig[i-1]+crr)/10;
        i--;
     }

     if(crr>0){

        ans[0]=crr;
        return ans;

     }


    return Arrays.copyOfRange(ans,1,n+1);

    }
}