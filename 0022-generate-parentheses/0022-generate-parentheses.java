class Solution {
    public List<String> generateParenthesis(int n) {

       
   List<String> ans=new ArrayList<>();
   String str=new String();
   combination(n,n,ans,new StringBuilder());
   return ans;


        
    }

    public void combination(int a,int b,List<String> ans, StringBuilder str){

        if(a==0&&b==0){

            ans.add(str.toString());

            return;
           
}







     if(a>0){
        str.append('(');
       combination(a-1,b,ans,str);
       str.deleteCharAt(str.length()-1);
     }

       if(b>a){
        str.append(')');
      combination(a,b-1,ans,str);
      str.deleteCharAt(str.length()-1);
       }





    }




}