class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> comb=new ArrayList<>();
      com(1,n,k,ans,comb,0);
      return ans;
    }

    public void com(int i,int n,int k,List<List<Integer>> ans,List<Integer> comb,int cnt){
     if(cnt==k) {
        ans.add(new ArrayList(comb));
        return;
     }
     if(i>n) return;

     
    
     
     for(int j=i;j<=n;j++){
        comb.add(j);
        com(j+1,n,k,ans,comb,cnt+1);
        comb.remove(comb.size()-1);

     }



    }
}