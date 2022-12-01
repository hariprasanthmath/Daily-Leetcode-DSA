//https://leetcode.com/problems/remove-element/
//we are approaching from both sides
//1. we have to swap whenever we saw forward pointer value == val and backward pointer value is not val
//2. for other commbinations we have to take respective decisions to move the pointer
//3. return backward+1 is to return the position not the index

class Solution {
    public int removeElement(int[] nums, int val) {
        int forwardindex = 0;
        int backwardindex = nums.length-1;
        while(forwardindex <= backwardindex){
            if(nums[forwardindex]== val && nums[backwardindex]!= val){
                int temporary = nums[forwardindex];
                nums[forwardindex] = nums[backwardindex];
                nums[backwardindex] = temporary;
                forwardindex++;
                backwardindex--;
            }else if(nums[forwardindex]!= val && nums[backwardindex]!= val){
                forwardindex++;
            }else if(nums[forwardindex]== val && nums[backwardindex]== val){
                backwardindex--;
            }else if(nums[forwardindex]!= val && nums[backwardindex]== val){
                forwardindex++;
                backwardindex--;
            }
        }
        return backwardindex+1;
    }
}