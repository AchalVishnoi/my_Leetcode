class Solution {
    public int findSmallestInteger(int[] nums, int v) {

        HashMap<Integer,Integer> frq=new HashMap<>();

        for(Integer i:nums) frq.put((i%v+v)%v,frq.getOrDefault((i%v+v)%v,0)+1);
        
        int i=0;

        while(true){
            if(frq.containsKey(i%v)){
                if(frq.get(i%v)==1)frq.remove(i%v);
                else frq.put(i%v,frq.get(i%v)-1); 
            }
            else return i;
            i++;
        }





        
    }
}