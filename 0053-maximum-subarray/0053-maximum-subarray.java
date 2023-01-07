class Solution {
    public int maxSubArray(int[] nums) {
        int arrayLength = nums.length;
        int[] maxSumAtCurrentPosition = new int[arrayLength];
        int maximum = nums[0];
        maxSumAtCurrentPosition[0] = nums[0];
        for(int index=1;index<arrayLength;index++){
            maxSumAtCurrentPosition[index] = nums[index] + (maxSumAtCurrentPosition[index-1] < 1 ? 0 : maxSumAtCurrentPosition[index-1]);
            maximum = Math.max(maxSumAtCurrentPosition[index], maximum);
        }
        
        return maximum;
    }
    
}