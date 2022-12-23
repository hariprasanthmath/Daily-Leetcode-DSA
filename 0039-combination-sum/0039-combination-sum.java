class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> result = new ArrayList<>();
      HashMap<String,Integer> hmap = new HashMap<>();
      HashSet<Integer> hset = new HashSet<>();
        for(int i=0;i<candidates.length;i++){
            hset.add(candidates[i]);
        }
        int[] arr2 = new int[hset.size()];
        Arrays.sort(arr2);
        Iterator<Integer> itr = hset.iterator();
        int idx = 0;
        while(itr.hasNext()){
            arr2[idx] = itr.next();
            idx++;
        }
        
      List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
      subSum(result,hmap,list,arr2,target,0);
        return result;
    }
    public static void subSum(List<List<Integer>> result,HashMap<String,Integer> hmap,List<Integer> list,int[] arr2,int target,int index){
 
         if(target == 0){
             result.add(new ArrayList<>(list));
             return;
         }
        if(index == arr2.length){
            return;
        }
        // including and again adding same element to the sum
        if(arr2[index] <= target){
            list.add(arr2[index]);
            subSum(result,hmap,list,arr2,target-arr2[index],index);
            list.remove(list.size()-1);
        }
        // not including the current element and calling the next element
        subSum(result,hmap,list,arr2,target,index+1);
        
        
        
        
    }
}