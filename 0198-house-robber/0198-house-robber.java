class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        else if(nums.length == 2) return Math.max(nums[0],nums[1]);
        int[][] startendprecalculated = new int[nums.length][nums.length];
        for(int[] row: startendprecalculated)
           Arrays.fill(row,-1);
        return recursive(nums,0,nums.length-1,startendprecalculated);
    }
    public static int recursive(int[] nums, int start,int end,int[][] startendprecalculated){
       
        if(start == nums.length-1) return nums[start];
        if(start == nums.length) return 0;
         if(startendprecalculated[start][end] != -1){
            return startendprecalculated[start][end];
        }
        return startendprecalculated[start][end] = Math.max(nums[start]+recursive(nums,start+2,end,startendprecalculated), recursive(nums,start+1,end,startendprecalculated));
    }
}