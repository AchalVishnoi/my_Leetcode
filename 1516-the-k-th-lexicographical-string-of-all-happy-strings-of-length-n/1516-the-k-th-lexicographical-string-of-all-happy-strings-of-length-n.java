class Solution {
    int cnt=0;
    public String getHappyString(int n, int k) {
        

        StringBuilder s=new StringBuilder();
        get(s,n,k,'z');

        return s.toString();




    }

    public void get(StringBuilder s, int n,int k, char prev){

   
   if(s.length()==n){
    cnt++;
    return;
   }
    

    for(char i='a';i<'d';i++){
     
     if(i!=prev){
        s.append(i);
        get(s,n,k,i);
        if(cnt==k) return;
        s.deleteCharAt(s.length()-1);

     }




    }


    }




}