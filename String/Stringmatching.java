append char from  start till size of needle to string buffer
compare this string with needle
have increment counter (initialize to -1)
increment for every window
compare after every incrementation and retrun if both are equal

class Solution {
    public int strStr(String haystack, String needle) {
        int startindex = -1;

        int haystacksize = haystack.length(); // 9
        int needlesize = needle.length(); // 3
        StringBuffer str = new StringBuffer();
        if(haystacksize < needlesize) return -1;
        for(int needleloop=0; needleloop<needlesize; needleloop++){ // 0 to < 3
                str.append(haystack.charAt(needleloop)); // s a d
        }
        startindex++; // 0
        if(needle.equals(str.toString())){ // sad == sad -> true
            return startindex;
        }  
        // 3 to 9 - 3
        for(int hayindex=needlesize; hayindex<haystacksize; hayindex++){ // s a d u t s a d
            str.append(haystack.charAt(hayindex));                                   // s a d u
            str.deleteCharAt(0);//  a d u
            startindex++; // 1
            if(needle.equals(str.toString())){  //sad == adu
                return startindex;
            }
        }
        return -1;
        
}
}