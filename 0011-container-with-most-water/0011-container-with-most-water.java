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

class Solution2 {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length-1;

        int maxResult = Integer.MIN_VALUE;

        while(right > left){
            int currentMin = Math.min(height[left] , height[right]);
            int difference = right - left;
            maxResult = Math.max(maxResult, difference * currentMin);
            if(height[left] >= height[right]){
                right--;
            }else{
                left++;
            }

        }

        return maxResult; 
    }
}