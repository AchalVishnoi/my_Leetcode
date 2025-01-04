class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans=new ArrayList<>();

         permutation(nums,ans,new ArrayList<>());
         return ans;
        
    }

    public void permutation(int a[],List<List<Integer>> ans,List<Integer> com){

       

        if(com.size()==a.length){
            ans.add(new ArrayList<>(com));
            return;

        }


        for(int i=0;i<a.length;i++){

            if(a[i]==11) continue;
            com.add(a[i]);
            int temp=a[i];
            a[i]=11;
            permutation(a,ans,com);
            a[i]=temp;
            com.remove(com.size()-1);


        }


      


    }
}