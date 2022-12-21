class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
          List<List<Integer>> result = new ArrayList<>();
        TreeMap<Integer,Integer> Hmap = new TreeMap<>();
        for(int index=0;index<items1.length;index++){
            Hmap.put(items1[index][0],items1[index][1]);
        }
        for(int index=0;index<items2.length;index++){
            if(Hmap.containsKey(items2[index][0])){
                int value = Hmap.get(items2[index][0]);
                Hmap.put(items2[index][0],items2[index][1]+value);
            }else{
                 Hmap.put(items2[index][0],items2[index][1]);
            }
            
        }
        for(Integer val: Hmap.keySet()){
            List<Integer> valWeight = new ArrayList<>();
            valWeight.add(val);
            valWeight.add(Hmap.get(val));
            result.add(valWeight);
        }
        return result;
    }
}