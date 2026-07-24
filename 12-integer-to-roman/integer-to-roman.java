class Solution {
    public String intToRoman(int num) {
         int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] symbols = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };
        int i =0;

        String str = new String();

        while( num > 0){
            if(num >= values[i]){
                str = str + symbols[i];
                num= num- values[i];
            }
            else{
                i++;
            }
        }
        return str;
    }
}