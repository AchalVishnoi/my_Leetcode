class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        

      /* int shiftcnt=0;

       while(left!=right){
       left= left>>1;
       right= right>>1;
       shiftcnt++;
       }

       return left<<shiftcnt;

*/


while(right>left){
    right=right&(right-1);
}
return right;

    }
}