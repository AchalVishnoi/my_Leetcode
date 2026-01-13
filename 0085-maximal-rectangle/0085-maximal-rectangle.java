class Solution {
    public int maximalRectangle(char [][] mat) {
        
      
        int n=mat.length;
        int b[]=new int[mat[0].length];
        b=charToInt(mat[0]);
          int maxRect=maxRect(b);


        for(int i=1;i<n;i++)    
        {    int c[]=new int[mat[i].length];
        c=charToInt(mat[i]);
            for(int j=0;j<mat[0].length;j++){
          if(b[j]>0&&c[j]>0){
            b[j]+=c[j];
              }
          else{
              b[j]=c[j];
             }

            }
            maxRect=Math.max(maxRect,maxRect(b));


        }

        
          
       

return maxRect;


        
    }


    public int maxRect(int a[]){
        int n=a.length;
        int max=Integer.MIN_VALUE;
        int next[]=next(a);
         int prev[]=prev(a);
         for(int i=0;i<n;i++){
            max=Math.max(max,(next[i]-prev[i]-1)*(a[i]));
         }
         return max;
    }
     public static int[] next(int a[]){
      
         int n=a.length;
            int ans[]=new int[n];
        Stack <Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&(a[st.peek()])>=(a[i]))
                      st.pop();

                      if(st.isEmpty())
                      ans[i]=n;
                      else 
                      ans[i]=st.peek();
                       st.push(i);


        }
        return ans;
        
    }

    public static int[] prev(int a[]){
       int n=a.length;
            int ans[]=new int[n];
        Stack <Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&(a[st.peek()])>=(a[i]))
                      st.pop();

                      if(st.isEmpty())
                      ans[i]=-1;
                      else 
                      ans[i]=st.peek();
                       st.push(i);


        }
        return ans;


    }
     public static int[] charToInt(char a[]){
       
       int b[]=new int [a.length];
       for(int i=0;i<a.length;i++){
        b[i]=Character.getNumericValue(a[i]);

       }

         return b;

     }
}