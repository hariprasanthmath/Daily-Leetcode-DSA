class Solution {
    public String longestPalindrome(String questionStr) {
        int questionLength = questionStr.length();
        
        String longest = "";
        int longestResult = 0;
        StringBuffer currentString = new StringBuffer(questionStr);
            
        for(int index=0; index<questionStr.length(); index++){
            
            
            
            
                 int left = index;
                 int right = index;
                 while(left>=0 && right < questionStr.length() && questionStr.charAt(left) == questionStr.charAt(right)){
                int currentSize = right - left + 1;
                if(currentSize > longestResult){
                    longest = currentString.substring(left,right+1);
                    longestResult = currentSize;
                }
                left--;
                right++;
            }
                
        
                
                 left = index;
                 right = index+1;
                 while(left>=0 && right < questionStr.length() && questionStr.charAt(left) == questionStr.charAt(right)){
                int currentSize = right - left + 1;
                if(currentSize > longestResult){
                    longest = currentString.substring(left,right+1);
                    longestResult = currentSize;
                }
                left--;
                right++;
            }
            
        }
        
        
        if(longestResult == 0){
            return "" + questionStr.charAt(0);
        }else{
            return longest;
        }
        
    }
}