class Solution {
    public String reverseStr(String s, int k) {
        char[] letterarr = s.toCharArray();
        if(k >= s.length()){
            reverseArray(letterarr,0,s.length()-1);
            return new String(letterarr);
        }
        int index = 0;
        while(index<s.length()){
            if(index + k -1 <= s.length()-1){
                reverseArray(letterarr, index , index+k-1);
                index = index + 2*k;
            }else if(s.length()-1 - index >= 0){
                reverseArray(letterarr, index , s.length()-1);
                break;
            }
        }
        return new String(letterarr);
        
    }
    public static void reverseArray(char[] letterarr,int start, int end){
        
        while(start<=end){
            char tempstore = letterarr[start];
            letterarr[start] = letterarr[end];
            letterarr[end] = tempstore;
            start++;
            end--;
        }
    }
}