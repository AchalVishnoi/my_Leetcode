
/* using backtracking
class Solution {
    
    public String smallestNumber(String pat) {
        

   StringBuilder ans=new StringBuilder();
   solve(pat,ans,0,0, new int[9]);
   

   return ans.toString();


    }
    
    public boolean solve(String pat, StringBuilder ans, int i, int lim,  int used[]){
    
     if(i>pat.length()){
        return true;
     }

      if(i==0)
      for(int j=1;j<10;j++){
        if(used[j-1]!=0) continue;
        ans.append((char)('0'+j));
        used[j-1]=1;
         if(solve(pat, ans, i+1, j,used)) return true;
         used[j-1]=0;
        
        ans.deleteCharAt(ans.length()-1);

      }
      else{
       
       if(pat.charAt(i-1)=='I'){
        for(int j=lim+1;j<10;j++){
        if(used[j-1]!=0) continue;
        ans.append((char)('0'+j));
        used[j-1]=1;
         if(solve(pat, ans, i+1, j, used)) return true;
         used[j-1]=0;
        
        ans.deleteCharAt(ans.length()-1);
      }
       }
       else{
        for(int j=1;j<lim;j++){
       if(used[j-1]!=0) continue;
        ans.append((char)('0'+j));
        used[j-1]=1;
         if(solve(pat, ans, i+1, j,used)) return true;
         used[j-1]=0;
        
        ans.deleteCharAt(ans.length()-1);
      }
       }



      }



    return false;

    }






}
*/

// using stack
import java.util.Stack;

class Solution {
    
    public String smallestNumber(String pat) {
        StringBuilder ans = new StringBuilder();
        Stack<Integer> st = new Stack<>();

        
        for (int i = 1; i <= pat.length() + 1; i++) {
            st.push(i);

         
            if (i == pat.length()+1|| pat.charAt(i - 1) == 'I') {
                while (!st.isEmpty()) {
                    ans.append(st.pop());
                }
            }
        }

        return ans.toString();
    }
}
