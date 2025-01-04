class Solution {
    public List<List<Integer>> combinationSum2(int[] can, int tar) {
        Arrays.sort(can);

        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> com=new ArrayList<>();


        combinations(can,tar,com,ans,0);
        return ans;



        
    }


    public void combinations(int[] c, int tar, List<Integer> comb,List<List<Integer>> ans, int i){

        

       if(tar<0) return;

        if(tar==0) {
            ans.add(new ArrayList<>(comb));
            return;
        }



        for(int j=i;j<c.length;j++){

            if (j>i && c[j] == c[j-1]) {
                continue;
            }
            
            if (c[i] > tar) {
                break;
            }

          
          comb.add(c[j]);
          combinations(c,tar-c[j],comb,ans, j+1);
          comb.remove(comb.size()-1);


        }
        

     }
      


    }
