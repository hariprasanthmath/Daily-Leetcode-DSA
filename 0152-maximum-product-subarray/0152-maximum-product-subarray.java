class Solution {
    public int maxProduct(int[] nums) {
        int max_end_here = nums[0];
        int min_end_here = nums[0];
        int max_till_now = nums[0];
        for(int i=1;i<nums.length;i++){
            int calmax = Math.max(Math.max(nums[i],max_end_here*nums[i]),min_end_here*nums[i]);
            min_end_here = Math.min(Math.min(nums[i],max_end_here*nums[i]),min_end_here*nums[i]);
            max_end_here = calmax;
            max_till_now = Math.max(max_till_now,max_end_here);
        }
        return max_till_now;
        
        //  int maxProduct = 0;
        // for(int index=0;index<array.length;index++){
        //     int currentProduct = array[index];
        //     maxProduct = Math.max(currentProduct, maxProduct);
        //     for(int jindex=index+1;jindex<array.length;jindex++){
        //         currentProduct = currentProduct * array[jindex];
        //         maxProduct = Math.max(currentProduct, maxProduct);
        //     }
        // }
        // return maxProduct;
    }
}