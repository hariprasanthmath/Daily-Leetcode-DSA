class Solution {
    public String longestPalindrome(String s) {
        int maxLength = 0;
        String resultString = "";
        for(int index=0; index<s.length(); index++){
            String subString = "";
            for(int jindex=index; jindex<s.length(); jindex++){
                subString += s.charAt(jindex);
                if(palindrome(subString) && maxLength <= jindex-index+1){
                    maxLength = jindex-index+1;
                    resultString = subString;
                }
            }
        }
        return resultString;
    }
    public static boolean palindrome(String inputString){
        if(inputString.length() == 0) return false;

        boolean result = true;
        int startIndex = 0;
        int endIndex = inputString.length()-1;

        while(startIndex <= endIndex){
            if(inputString.charAt(startIndex) != inputString.charAt(endIndex)){
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;

    }
}
