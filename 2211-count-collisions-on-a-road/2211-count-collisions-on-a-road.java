class Solution {
    public int countCollisions(String dir) {
        int n=dir.length();

        int i=0;
        int j=n-1;
        while(i<n&&dir.charAt(i)=='L')i++;
        while(j>=0&&dir.charAt(j)=='R') j--;

        int ans=0;
        while(i<=j){
          if(dir.charAt(i)!='S') ans++;
          i++;
        }



        return ans;


        
    }
}