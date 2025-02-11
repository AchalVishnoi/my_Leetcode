class Solution {
    public List<List<String>> partition(String s) {

    List<List<String>>ans=new ArrayList<>();
    solve(s,0,new ArrayList<>(),ans);
    return ans;

        
    }


    public void solve(String s,int i,List<String> m,List<List<String>>ans){

    if(i>=s.length()) {
        ans.add(new ArrayList<>(m));
        return;
    }

     for(int j=i+1;j<=s.length();j++){
      
      if(isPelin(s.substring(i,j))){
         m.add(s.substring(i,j));
         solve(s,j,m,ans);
         m.remove(m.size()-1);


      }
       



     }



    }

    private boolean isPelin(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)) return false;
        }
        return true;
    }

}