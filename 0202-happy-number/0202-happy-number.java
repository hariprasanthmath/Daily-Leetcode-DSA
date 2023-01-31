class Solution {
    public boolean isHappy(int n) {
        
        HashMap<Integer,Boolean> sol = new HashMap<>();
        return isPossible(n, sol);
    }
    
      
    public static boolean isPossible(int target, HashMap<Integer,Boolean> sol){
       
        
        int squareValue = 0;
        while(target != 0){
            int remainder = target % 10;
            squareValue = squareValue + remainder * remainder;
            target = target / 10;
        }
        
        if(sol.containsKey(squareValue)){
            return false;
        }else{
            sol.put(squareValue, true);
        }
        
        // if(squareValue > 1 && squareValue < 10){
        //     return false;
        // }
        
        if(squareValue == 1){
            return true;
        }else{
           return isPossible(squareValue, sol);
        }
        
        // while(target != 1 && )
    }
}