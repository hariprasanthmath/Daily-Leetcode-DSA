class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] remainingCapacity = new int[capacity.length];
        int size = capacity.length;
        for(int index=0;index<size;index++){
            remainingCapacity[index] = capacity[index] - rocks[index];
        }
        int result = 0;
        Arrays.sort(remainingCapacity);
        for(int index=0;index<size;index++){
            if(remainingCapacity[index] == 0){
                result += 1;
            }else if(remainingCapacity[index] <= additionalRocks){
                additionalRocks -= remainingCapacity[index];
                result += 1;
            }else{
                break;
            }
        }
        return result;
    }
}