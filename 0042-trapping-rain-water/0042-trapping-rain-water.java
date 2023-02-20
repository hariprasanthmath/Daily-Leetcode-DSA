class Solution {
    public int trap(int[] height) {
        
        // first we have to find the max height to the left for current index
        
        int[] leftMax = new int[height.length];
        leftMax[0] = height[0];
        for(int index=1;index<height.length;index++){
            leftMax[index] = Math.max(height[index], leftMax[index-1]);
        }
        
        // find max height to right of an index
        
        int[] rightMax = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int index=height.length-2; index>=0; index--){
            rightMax[index] = Math.max(height[index], rightMax[index+1]);
        }
        
        int resultTotalWaterTrapped = 0;
        
        for(int index=0;index<height.length-1;index++){
            int currentWaterheight = Math.min(leftMax[index], rightMax[index]) - height[index];
            resultTotalWaterTrapped += currentWaterheight;
        }
        
        return resultTotalWaterTrapped;
    }
}