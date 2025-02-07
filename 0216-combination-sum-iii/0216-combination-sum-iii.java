class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
      List<List<Integer>> ans=new ArrayList<>(); 
      List<Integer> comb=new ArrayList<>();

     com(1,ans,comb,n,k);
     return ans;
    }

    public void com(int i,List<List<Integer>> ans,List<Integer> comb,int tar,int k){
       if(k==0&&tar==0){
        ans.add(new ArrayList(comb));
        return;
      }

      
      if(k<0||tar<0||i>9) return;
     
       
       comb.add(i);
       com(i+1,ans,comb,tar-i,k-1);
       comb.remove(comb.size()-1);
       com(i+1,ans,comb,tar,k);








     }

}