class Solution {
    public int maxScore(String s) {

        int totalZero = 0;
         int totalOne = 0;
         int totZeroFrmLeftToCurrent = 0;
         int totOneFromLeft = 0;
         int result = 0;
         int max = 0;

        for(int index=0; index < s.length(); index++){
            if(s.charAt(index) == '0'){
                totalZero++;
            }else{
                totalOne++;
            }
        }
        for(int index=0; index < s.length()-1; index++){
            if(s.charAt(index) == '0'){
                totZeroFrmLeftToCurrent++;
            }else{
                totOneFromLeft++;
            }
            result =  totZeroFrmLeftToCurrent + (totalOne - totOneFromLeft);
            max = Math.max(max, result);
        }
        return max;
    }
}