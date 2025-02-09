class Solution {
    public long countCompleteDayPairs(int[] hrs) {
        long[] a = new long[24];
        long ans = 0;

        for (int hour : hrs) {
            a[hour % 24]++;
        }

        ans += (a[0] * (a[0] - 1)) / 2;  // Pairs among 0
        ans += (a[12] * (a[12] - 1)) / 2; // Pairs among 12

        int i = 1, j = 23;
        while (i < j) {
            ans +=  a[i] * a[j]; // Pairs between i and j
            i++;
            j--;
        }

        return ans;
    }
    }


   /* by using hashmap
int n=hrs.length;
        long ans=0;
    HashMap <Integer,Integer> m=new HashMap<>();
     for(int i=0;i<n;i++){
        int rem= hrs[i]%24;
        int com=(24-rem)%24; //to hendle the case rem==0
        ans+=m.getOrDefault(com,0);
        m.put(rem,m.getOrDefault(rem,0)+1);


     }
    

*/