class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        String questionStr = "dsahariirahdsa";
 
 int strLength = questionStr.length();
       int[][] dp = new int[strLength][strLength];

       int maxLength = 1;
       String maxString = "";
       int startIndex = 0;
       int endIndex = 0;
       for(int index=0;index<strLength;index++){
           for(int jindex=0;jindex<strLength;jindex++){
               if(index==jindex){
                   dp[index][jindex] = 1;
                   
               }
               if(jindex-index == 1  && questionStr.charAt(jindex) == questionStr.charAt(index)){
                   dp[index][jindex] = 1;
                   if(maxLength <= jindex-index+1){
                       maxLength = jindex-index+1;
                       startIndex = index;
                       endIndex = jindex;
                   }
               }

           }
       }
       for(int index=strLength-2;index>=0;index--){
           for(int jindex=index+1;jindex<strLength;jindex++){
               if(questionStr.charAt(jindex) == questionStr.charAt(index) && dp[index+1][jindex-1] == 1){
                   dp[index][jindex] = 1;
                   if(maxLength < jindex-index+1){
                       maxLength = jindex-index+1;
                       startIndex = index;
                       endIndex = jindex;
                   }

               }

           }
        }
        for(int index=0;index<strLength;index++){
           for(int jindex=0;jindex<strLength;jindex++){
               System.out.print(dp[index][jindex]+" ");
           }
           System.out.println();
        }
        System.out.println(questionStr.substring(startIndex,endIndex+1));
         
    
    }
    
}
