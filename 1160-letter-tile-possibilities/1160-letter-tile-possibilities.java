class Solution {
    public int numTilePossibilities(String t) {

        int n=t.length();
         
         int v[]=new int [26];
         for(int i=0;i<t.length();i++){
             v[t.charAt(i)-'A']++;
         }




        return solve(v);
        
    }



    public int solve(int []v){
     
    
       int cnt=0;


       for(int i=0;i<26;i++){

        if(v[i]>0){
            cnt++;
            v[i]--;
            cnt+=solve(v);
            v[i]++;

        }
       
       }


      return cnt;
    }
}