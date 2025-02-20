class Solution {
    
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
    StringBuilder s =new StringBuilder();
    

    for(int i=0;i<n;i++){
        s.append(nums[i].charAt(i)=='0'?'1':'0');
    }
   

   return s.toString();
    }
}




/*
//using backtracking
class Solution {
    int fl=0;
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
    StringBuilder s =new StringBuilder();
    HashSet<String> h =new HashSet<>();
    for(int i=0;i<n;i++){
        h.add(nums[i]);
    }

    check(h,s,n);
    fl=0;
    return s.toString();



    }




    public void check(HashSet<String> h, StringBuilder s,int n){
    
    if(s.length()==n){
        if(h.contains(s.toString())) return;
        else{
            fl=1;
            return;
        }
    }

     
     s.append('0');
     check(h,s,n);
     if(fl==1) return;
     s.deleteCharAt(s.length()-1);
     s.append('1');
     check(h,s,n);
     if(fl==1) return;
     s.deleteCharAt(s.length()-1);




    }
}*/