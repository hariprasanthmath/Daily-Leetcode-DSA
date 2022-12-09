class Solution {
    public int maxArea(int[] height) {
        
        int maxstorage = 0;
        int leftindex = 0;
        int rightindex = height.length-1;
        while(leftindex<rightindex){
             maxstorage = Math.max(maxstorage, (rightindex - leftindex) * Math.min(height[leftindex],height[rightindex]));
             if(height[leftindex]<height[rightindex]){
                 leftindex++;
             }else{
                 rightindex--;
             }
        }
        return maxstorage;
    }
}