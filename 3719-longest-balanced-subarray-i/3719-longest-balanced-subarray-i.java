class Solution {
    int[] s1 = new int[100001]; 
    public int longestBalanced(int[] nums) {

        int n=nums.length;
        int ans=0;
        int timer=0;
        for(int i=0;i<n;i++){

            timer++;
            int ev=0;
            int odd=0;
            for(int j=i;j<n;j++){

                int val=nums[j];
                if(val%2==0){
                    if(s1[val]!=timer){
                        s1[val]=timer;
                        ev++;
                    }
                }
                else{
                    if(s1[val]!=timer){
                        s1[val]=timer;
                        odd++;
                    }
                }

                if(ev==odd){
                    ans=Math.max(ans,j-i+1);
                }

              
            }
        }

        return ans;
        
    }
}