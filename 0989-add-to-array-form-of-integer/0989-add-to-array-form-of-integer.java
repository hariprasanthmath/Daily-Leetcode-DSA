class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        List<Integer> kList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        while(k!=0){
            int remainder = k%10;
            kList.add(0,remainder);
            k /= 10;
        }
        
        int remainder = 0;
        
        int mainIndex = num.length - 1;
        int sideIndex = kList.size() - 1;
        
        while(mainIndex>=0 && sideIndex >=0){
            int value = num[mainIndex] + kList.get(sideIndex) + remainder;
            resultList.add(0,value%10);
            remainder = value / 10;
            mainIndex--;
            sideIndex--;
        }
        
        while(mainIndex>=0){
            
            int value = num[mainIndex] + remainder;
            resultList.add(0,value%10);
            remainder = value / 10;
            mainIndex--;
        }
        
        while(sideIndex >=0){
            
            int value = kList.get(sideIndex)  + remainder;
            resultList.add(0,value%10);
            remainder = value / 10;
            sideIndex--;
        }
        
        if(remainder > 0){
            resultList.add(0,remainder);
        }
        return resultList;
        
    }
}