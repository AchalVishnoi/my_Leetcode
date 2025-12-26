class Solution {
    public int bestClosingTime(String s) {

        int n=s.length();

        int a[]=new int[n];
        int b[]=new int[n];
        a[0]=s.charAt(0)=='N'?1:0;
        b[n-1]=s.charAt(n-1)=='Y'?1:0;
        for(int i=1;i<n;i++){
            a[i]=a[i-1];
            b[n-i-1]=b[n-i];
            if(s.charAt(i)=='N') a[i]++;
            if(s.charAt(n-i-1)=='Y') b[n-i-1]++;
        }

        int min=b[0];

        int j=0;
        
        for(int i=1;i<n;i++){
          if(min>a[i-1]+b[i]){
            min=a[i-1]+b[i];
            j=i;
          }
        }
        if(min>a[n-1]){
          j=n;
        }

        return j;

        
    }
}