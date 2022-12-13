class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length-1] = digits[digits.length-1] + 1;
        if(digits[digits.length-1] < 9 && digits[digits.length-1] != 0){
            return digits;
        }else{
             
            int remainder = 0;

            for(int index=digits.length-1;index>=0;index--){
                int temp = digits[index]+remainder;
                digits[index] = temp % 10;
                remainder = temp / 10;
            }
            if(remainder != 0){
                 int[] resultarr = new int[digits.length+1];
                 resultarr[0] = remainder;
                     for(int index=0;index<digits.length-1;index++){
                             resultarr[index+1] = digits[index];
                      }
                      return resultarr;
            }
        }
       return digits;

    }
}