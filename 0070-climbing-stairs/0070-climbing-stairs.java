class Solution {
    public int climbStairs(int n) {
        int[] posibilityat = new int[n+1];
        if(n<=2){
            return n;
        }
         posibilityat[0] = 0;
         posibilityat[1] = 1;
         posibilityat[2] = 2;
        for(int step=3;step<=n;step++){
            posibilityat[step] = posibilityat[step-1] + posibilityat[step-2];
        }
        return posibilityat[n];
    }
    
}