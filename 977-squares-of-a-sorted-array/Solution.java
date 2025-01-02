class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int index=0; index<nums.length; index++){
           nums[index] = nums[index] * nums[index];
        }
        Arrays.sort(nums);
        return nums;
    }
}