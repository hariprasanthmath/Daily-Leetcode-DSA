class Solution {
    public int lengthOfLastWord(String s) {
        boolean charstarted = false;
        int count = 0;
        for(int index=s.length()-1;index>=0;index--){
               if(!Character.isWhitespace(s.charAt(index))){
                   charstarted = true;
               }
               if(charstarted && !Character.isWhitespace(s.charAt(index))){
                   count++;
               }
               if(charstarted && Character.isWhitespace(s.charAt(index))){
                   break;
               }
        }
        return count;
    }
}