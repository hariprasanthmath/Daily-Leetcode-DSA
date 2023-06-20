/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var getAverages = function(nums, k) {
    let windowSize = 2 * k + 1;
    let startingPoint = k;

    // first iteration
    let sum = 0;
    let result = [];
    for(let index=0; index<windowSize; index++){
        sum += nums[index];
    }
    result.push(sum);
     
    // second iteration
    for(let index=windowSize; index<nums.length; index++){
        sum -= nums[index-windowSize];
        sum += nums[index];
        result.push(sum);
        console.log(sum);
    }

    let finalResult = [];
    let resultIndexMap = -1;

    for(let index=0;index<nums.length;index++){
        if(index+k < nums.length && index-k >= 0){
            resultIndexMap++;
            finalResult.push(Math.floor(result[resultIndexMap]/windowSize));
        }else{
            finalResult.push(-1);
        }
    }
return finalResult;
};