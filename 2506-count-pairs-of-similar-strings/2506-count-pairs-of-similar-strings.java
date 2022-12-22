class Solution {
    public int similarPairs(String[] words) {
        int count = 0;
        for(int index=0;index<words.length-1;index++){
           for(int index2=index+1;index2<words.length;index2++){
                           if(twoStringCompare(words[index],words[index2])){
                             count++;
                           }
           }
        }
        return count;
    }
    public static boolean twoStringCompare(String strone, String strtwo){
        Set set1 = new HashSet<>();
        for(char value: strone.toCharArray()) set1.add(value);
        Set set2 = new HashSet<>();
        for(char value: strtwo.toCharArray()) set2.add(value);
        return set1.equals(set2);
    }
}