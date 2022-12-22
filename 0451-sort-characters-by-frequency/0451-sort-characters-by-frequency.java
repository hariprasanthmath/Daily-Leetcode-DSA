class Solution {
    public String frequencySort(String s) {
        int inputlength = s.length();
        char[] stringchar = new char[inputlength];
        TreeMap<Character,Integer> CharFrequency = new TreeMap<>();
        for(char strchar: s.toCharArray()) CharFrequency.put(strchar,CharFrequency.getOrDefault(strchar,0)+1);
        List<Character> resultList = new ArrayList<>(CharFrequency.keySet());
        Collections.sort(resultList, (a,b)->  (CharFrequency.get(b) - CharFrequency.get(a)));
        String resultstring = "";
        for(char eachchar: resultList){
            int countofchar = CharFrequency.get(eachchar);
            String temporary = "";
            while(countofchar-->0){
                temporary += eachchar;
            }
            resultstring += temporary;
        }
        return  resultstring;
    }
}