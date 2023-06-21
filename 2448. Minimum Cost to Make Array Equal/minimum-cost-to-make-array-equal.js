/**
 * @param {number[]} nums
 * @param {number[]} cost
 * @return {number}
 */
var minCost = function(nums, cost) {
    // find max
    // find min
    // calculate min cost for range from min value to max value
    // brute force approach

    let max = Number.MIN_SAFE_INTEGER;
    let min = Number.MAX_SAFE_INTEGER;
  
    nums.forEach((eachValue, index)=>{
        if(eachValue <= min){
              min = eachValue;
        }
        if(eachValue >= max){
            max = eachValue;
        }
    });
      if(min === max){
          return 0;
      }
      
    let resultValue = Number.MAX_SAFE_INTEGER;
    for(let currentTarget=min; currentTarget<=max; currentTarget++){
       
        let totalCost = 0;
        for(let index=0;index<nums.length;index++){
            let currentValue = nums[index];
            let diff = Math.abs(currentValue-currentTarget);
            totalCost += diff * cost[index];
            
        }
        
        if(resultValue > totalCost){
            resultValue = totalCost;
        }

    }

    return resultValue;
};