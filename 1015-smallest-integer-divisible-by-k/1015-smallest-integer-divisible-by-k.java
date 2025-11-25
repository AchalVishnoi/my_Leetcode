class Solution {
    public int smallestRepunitDivByK(int k) {

        if(k%2==0||k%5==0) return -1;

        int i=1;
        int n=1%k;
        while(n!=0){
            n=(n*10+1)%k;
            i++;
        }


        return i;

        
    }
}