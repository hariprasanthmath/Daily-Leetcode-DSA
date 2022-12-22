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
        HashMap<Character,Integer> Hmap = new HashMap<>();
        for(int index=0;index<strone.length();index++){
            Hmap.put(strone.charAt(index),1);
        }
        for(int index=0;index<strtwo.length();index++){
            if(!Hmap.containsKey(strtwo.charAt(index))){
                return false;
            }
        }
        HashMap<Character,Integer> Hmap2 = new HashMap<>();
        for(int index=0;index<strtwo.length();index++){
            Hmap2.put(strtwo.charAt(index),1);
        }
        for(int index=0;index<strone.length();index++){
            if(!Hmap2.containsKey(strone.charAt(index))){
                return false;
            }
        }
               return true;
    }
}