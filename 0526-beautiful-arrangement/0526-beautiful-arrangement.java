class Solution {
    int ans=0;
    public int countArrangement(int n) {
        find(0,0,n);
        return ans;
    }

    public void find(int j,int track,int n){

        if(j>=n) ans++;

        for(int i=1;i<=n;i++){
            if((j+1)%i!=0&&i%(j+1)!=0) continue;
            if(((1<<i)&track)==0){
                find(j+1,track|(1<<i),n);
            }
        }
    }
}