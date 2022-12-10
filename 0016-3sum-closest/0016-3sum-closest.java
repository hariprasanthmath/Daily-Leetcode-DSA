class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int resultsum = nums[0] + nums[1] + nums[nums.length-1];
        Arrays.sort(nums);
        for(int index=0;index<nums.length-2;index++){
            int forwardindex = index+1;
            int backindex = nums.length-1;
           // int currentSum = nums[index] + nums[forwardindex] + nums[backindex];
            while(forwardindex<backindex){
              int  currentSum = nums[index] + nums[forwardindex] + nums[backindex];
                if(currentSum>target){
                    backindex--;
                }else{
                    forwardindex++;
                }
                if(Math.abs(currentSum-target) < Math.abs(resultsum-target)){
                    resultsum = currentSum;
                }
            }
        }
        return resultsum;
    }
}