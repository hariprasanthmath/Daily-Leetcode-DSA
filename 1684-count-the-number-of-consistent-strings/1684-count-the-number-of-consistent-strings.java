class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        HashSet<Character> uniqueChar = new HashSet<>();
        for(char eachChar: allowed.toCharArray()) uniqueChar.add(eachChar);
        for(String eachWord: words){
            boolean found = true;
            for(char eachChar: eachWord.toCharArray()){
                if(!uniqueChar.contains(eachChar)){
                    found = false;
                }
            }
            if(found) count++;
        }
        return count;
    }
}