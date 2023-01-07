class Solution {
    public boolean canJump(int[] nums) {
        
        int[] solution = new int[nums.length];
        Arrays.fill(solution, -1);
        int result = isPossible(nums, 0, solution);
        return result == 1 ? true : false;
    }
    
    public static int isPossible(int[] nums, int currentIndex, int[] solution){
        
        if(currentIndex >= nums.length-1) return 1;
        
        if(solution[currentIndex] != -1) return solution[currentIndex];
        
        for(int value=1;value<=nums[currentIndex];value++){
            
             solution[currentIndex] = isPossible(nums,currentIndex+value,solution);
            
            if(solution[currentIndex] == 1)  return 1 ;
            
            
        }
        
        return 0;
    }
}