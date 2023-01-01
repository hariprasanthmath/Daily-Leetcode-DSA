class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] wordarr = s.split(" ");
        HashMap<Character,String> letterWordMap = new HashMap<>();
        if(wordarr.length != pattern.length()) return false;
        for(int index=0;index<pattern.length();index++){
            char currentChar = pattern.charAt(index);
            String currString = wordarr[index];
            if(letterWordMap.containsKey(currentChar) && !letterWordMap.get(currentChar).equals(currString)){
                return false;
            } if(letterWordMap.containsValue(currString) && !letterWordMap.containsKey(currentChar)){
                return false;
            }else{
                letterWordMap.put(currentChar,currString);
            }
            
        }
        return true;
    }
    
    
}