class Solution {
    public int longestBalanced(String s) {

        int n=s.length();

        int len=1;  //for type 1

        //for type 2
        int cnta[]=new int[n];
        int cntb[]=new int[n];
        int cntc[]=new int[n];
        int ia=-1;
        int ib=-1;
        int ic=-1;

        //for type 3
        HashMap<String,Integer> h=new HashMap<>();
        h.put("0,0", -1);

        int ans=1;

        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='a'){
                cnta[i]++;
                ia=i;
            }
            else if(c=='b'){
                cntb[i]++;
                ib=i;
            }
            else {
                ic=i;
                cntc[i]++;
            }
            if(i!=0){
                cnta[i]+=cnta[i-1];
                cntb[i]+=cntb[i-1];
                cntc[i]+=cntc[i-1];
                if(c==s.charAt(i-1)) len++;
                else{
                    ans=Math.max(ans,len);
                    len=1;
                }
            }

            if(ia>=0){
                if(cntb[i]-cntb[ia]==cntc[i]-cntc[ia]){
                    ans=Math.max(ans,i-ia);
                }
            }
            else{
               if(cntb[i]==cntc[i]){
                ans=Math.max(ans,i+1);
               } 
            }


            if(ib>=0){
                if(cnta[i]-cnta[ib]==cntc[i]-cntc[ib]){
                    ans=Math.max(ans,i-ib);
                }
            }
            else{
               if(cnta[i]==cntc[i]){
                ans=Math.max(ans,i+1);
               } 
            }


            if(ic>=0){
                if(cntb[i]-cntb[ic]==cnta[i]-cnta[ic]){
                    ans=Math.max(ans,i-ic);
                }
            }
            else{
               if(cntb[i]==cnta[i]){
                ans=Math.max(ans,i+1);
               } 
            }

            

            int a=cnta[i]-cntb[i];
            int b=cnta[i]-cntc[i];

            String key=a+","+b;

            if(h.containsKey(key)){
              ans=Math.max(ans,i-h.get(key));
            }else{
                h.put(key,i);
            }


        }


        ans=Math.max(len,ans);

        ans=Math.max(ans,countTwo('a','b',s.toCharArray()));
        ans=Math.max(ans,countTwo('a','c',s.toCharArray()));
        ans=Math.max(ans,countTwo('c','b',s.toCharArray()));

        return ans;

        
    }

    private int countTwo(char n1, char n2, char[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;
        int ans = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == n1) {
                sum++;
            } else if (arr[i] == n2) {
                sum--;
            } else {
                map = new HashMap<>();
                sum = 0;
                map.put(0, i);
                continue;
            }

            if (map.containsKey(sum)) {
                ans = Math.max(ans, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return ans;
    }
}