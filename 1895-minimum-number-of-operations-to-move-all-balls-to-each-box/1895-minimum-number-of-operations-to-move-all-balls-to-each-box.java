class Solution {
    public int[] minOperations(String a) {

        int n=a.length();

        //first i am counting that what staep will take to move all balls in left side to particular box
        //pref[i-1]=sum of all steps needed to move all balls on the left side of i-1 box to i-1 box;
        // now to calculate pref[i] we have to add pref[i-1](what step taken for i-1) but the thime taken by all ball to move in i-1 willl take more time to move to ith box
        //so it is calculated by count like if pref[i-1] has 2 balls than count will be 2
        //and we will also add what step will it take to move i-1 ball to ith box

        int pref[]=new int[n];
        pref[0]=0;
        int count=0;
        for(int i=1;i<n;i++){
        pref[i]=pref[i-1]+count+(a.charAt(i-1)-'0');
        if(a.charAt(i-1)-'0'==1) count++;
     }



        count=0;

         int prev=0;

         // same repetation from right side
         

         for(int i=n-2;i>=0;i--){
        pref[i]+=(prev+count+(a.charAt(i+1)-'0'));
        prev+=(a.charAt(i+1)-'0')+count;
        if((a.charAt(i+1)-'0')==1) count++;
        }

        
       
     
        
        



       




     return pref;

        
    }
}