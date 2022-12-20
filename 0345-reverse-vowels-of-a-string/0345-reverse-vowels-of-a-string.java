class Solution {
    public String reverseVowels(String s) {
        char[] letterarr = s.toCharArray();
        int front = 0;
        int back = s.length()-1;
        while(front<=back){
            if(checkVowel(letterarr[front]) && checkVowel(letterarr[back])){
                char tempstore = letterarr[front];
                letterarr[front] = letterarr[back];
                letterarr[back] = tempstore;
                front++;
                back--;
            }else if(!checkVowel(letterarr[front]) && checkVowel(letterarr[back])){
                front++;
            }else if(checkVowel(letterarr[front]) && !checkVowel(letterarr[back])){
                back--;
            }else{
                front++;
                back--;
            }
        }
        return new String(letterarr);
    }
    public static boolean checkVowel(char toFind){
        if(toFind == 'a' || toFind == 'e' || toFind == 'i' || toFind == 'o' ||toFind == 'u' || toFind == 'A' || toFind == 'E' || toFind == 'I' || toFind == 'O' || toFind == 'U' ){
            return true;
        }else{
            return false;
        }
    }
}