class Solution {
    public boolean isPalindrome(int x) {
         int p=x;
         boolean c=false;
        int q=0;
        for(int i=0;p>0;i++){
           int w=p%10;
           p=p/10;
           q=q*10+w;
        }
        if(x==q){
            c=true;

        }
        return c;
    }
}