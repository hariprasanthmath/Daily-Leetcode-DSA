https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/description/

class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxLength = -1;
        HashMap<Integer,Integer> numberCountPair = new HashMap<>();
        for(int row=0; row<rectangles.length; row++){
           int currentMin = Math.min(rectangles[row][0],rectangles[row][1]);
           if(numberCountPair.containsKey(currentMin)){
               int value = numberCountPair.get(currentMin);
               numberCountPair.put(currentMin,++value);
           }else{
               numberCountPair.put(currentMin,1);
           }
           maxLength = Math.max(currentMin,maxLength);
        }
        return numberCountPair.get(maxLength);
    }
}