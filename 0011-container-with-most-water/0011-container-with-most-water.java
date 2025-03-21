class Solution {
    public int maxArea(int[] height) {
           
      int i=0, j=height.length-1;
      int ansArea=0;
      while(i<j){
        ansArea=Math.max(ansArea,(j-i)*Math.min(height[i],height[j]));
        if(height[i]<height[j]){
            i++;
        }
        else{
            j--;
        }
      }

      return ansArea;
    }
}