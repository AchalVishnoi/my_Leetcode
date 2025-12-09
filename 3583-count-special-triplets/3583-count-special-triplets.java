class Solution {
    int mod=1000000007;
    public int specialTriplets(int[] nums) {

        int n=nums.length;
        int l[]=new int[n];
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<n;i++){
            int x=nums[i];
            if(freq.containsKey(x*2)){
                l[i]=freq.get(x*2);
            }
            freq.put(x,freq.getOrDefault(x,0)+1);
        }

        freq.clear();
        int ans=0;
        for(int i=n-1;i>=0;i--){
            int x=nums[i];
            if(freq.containsKey(x*2)){
                ans=(int)(ans+((long)l[i]*freq.get(x*2))%mod)%mod;
            }
            freq.put(x,freq.getOrDefault(x,0)+1);
        }

        return ans;
        
    }
}