class Solution {
    public String intToRoman(int num) {
        HashMap<Integer,String> m=new HashMap<>();
        m.put(1000,"M");
        m.put(900,"CM");
        m.put(500,"D");
        m.put(400,"CD");
        m.put(100,"C");
        m.put(90,"XC");
        m.put(50,"L");
        m.put(40,"XL");
        m.put(10,"X");
        m.put(9,"IX");
        m.put(5,"V");
        m.put(4,"IV");
        m.put(1,"I");
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
         StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; ++i) {
            if (num == 0)
                break;
            while (num >= values[i]) {
                sb.append(m.get(values[i]));
                num -= values[i];
            }
        }

        return sb.toString();   


        
    }
}