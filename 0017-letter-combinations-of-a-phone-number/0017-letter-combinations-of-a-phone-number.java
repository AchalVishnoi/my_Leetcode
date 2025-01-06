class Solution {
    String st[] = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) return ans;

        findComb(digits, ans, 0, new StringBuilder());
        return ans;
    }

    public void findComb(String dig, List<String> ans, int idx, StringBuilder s) {
   
        if (idx >= dig.length()) {
            ans.add(s.toString());
            return;
        }

        String str = st[dig.charAt(idx) - '0' - 2];
        int n = str.length();

        for (int i = 0; i < n; i++) {
          
            s.append(str.charAt(i));
           
            findComb(dig, ans, idx + 1, s);
            
            
            s.deleteCharAt(s.length() - 1);
        }
    }
}

//without string builder

/*
class Solution {

String st[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};



    public List<String> letterCombinations(String digits) {
          List<String> ans=new ArrayList<>();

        if(digits.length()==0) return ans;
        
     
    findComb(digits,ans,0,"");
    return ans;


    }


   public void findComb(String dig, List<String> ans, int idx ,String s){

    if(idx>=dig.length()){
        ans.add(s);
        return;
    }


    String str=st[dig.charAt(idx)-'0'-2];
    int n=str.length();
     for(int i=0;i<n;i++){
        
        // s+=str.charAt(i);
        findComb(dig,ans,idx+1,s+str.charAt(i));
        // s.removeIdx(idx);


     }



   }




}*/
