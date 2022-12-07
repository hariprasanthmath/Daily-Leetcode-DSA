// https://leetcode.com/problems/maximum-number-of-balls-in-a-box/description/

class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int numberOfball = highLimit - lowLimit + 1;
        HashMap<Integer,Integer> index_count = new HashMap<>();
        int maxCount = 0;
        for(int ballValue=lowLimit; ballValue<=highLimit; ballValue++){
            int digitsumvalue = digitsSum(ballValue);
            if(index_count.containsKey(digitsumvalue)){
                int count = index_count.get(digitsumvalue);
                index_count.put(digitsumvalue,++count);
                maxCount = Math.max(maxCount,count);
            }else{
                index_count.put(digitsumvalue, 1);
                maxCount = Math.max(maxCount, 1);
            }
        }
        return maxCount;
    }
    public static int digitsSum(int number){
        int sum = 0;
        while(number != 0){
            sum = sum + number % 10;
            number = number / 10; 
        }
        return sum;
    }
}