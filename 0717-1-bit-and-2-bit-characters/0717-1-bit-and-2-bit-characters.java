class Solution {
    public boolean isOneBitCharacter(int[] bits) {

        int n=bits.length;
        int i=0;
        while(i<n-2){
            if(bits[i]==0) i++;
            else i+=2;
        }
        if(bits[i]==0) return true;
        return false;
        
    }
}