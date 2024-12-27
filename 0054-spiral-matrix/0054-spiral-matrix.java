class Solution {
    public List<Integer> spiralOrder(int[][] nums) {
         List<Integer> ans = new ArrayList<>();
        int topRow=0,bottomRow=nums.length-1,rightCol=nums[0].length-1,leftCol=0;
     int totalElement=0;
     while(totalElement<nums.length*nums[0].length){
         //print top row
         for(int i=leftCol;i<=rightCol&& totalElement<nums.length*nums[0].length ;i++){
             ans.add(nums[topRow][i]);
         totalElement++;
         }
             topRow++;

         //print right column
         for (int i=topRow;i<=bottomRow &&totalElement<nums.length*nums[0].length ;i++){
             ans.add(nums[i][rightCol]);
         totalElement++;
         }
             rightCol--;


         //print bottom row
         for (int i=rightCol;i>=leftCol &&totalElement<nums.length*nums[0].length ;i--){
             ans.add(nums[bottomRow][i]);
         totalElement++;
         }
         bottomRow--;
         //print left column
         for (int i=bottomRow;i>=topRow && totalElement<nums.length*nums[0].length;i--){
            ans.add(nums[i][leftCol] );
         totalElement++;
         }
             leftCol++;


     }
     return ans;
    }
        
}
