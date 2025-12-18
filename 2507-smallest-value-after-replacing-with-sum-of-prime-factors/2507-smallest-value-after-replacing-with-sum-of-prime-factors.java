class Solution {
    public int smallestValue(int n) {

        while(true){


           int sum=0;
           int x=n;
           for(int i=2;i<n;i++){
               while(x%i==0){
                sum+=i;
                x/=i;
               }
           }

           if(x%n==0||sum==n) break;

           n=sum;

           






        }


        return n;
        
    }
}