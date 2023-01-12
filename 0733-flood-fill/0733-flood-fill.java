class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialpixel = image[sr][sc];
        Solution(image,sr,sc,color,initialpixel);
        return image;
    }
    public static void Solution(int[][] image, int startRow, int startCol, int color, int initialpixel){
        boolean underMatrix = startRow>=0 && startRow <image.length && startCol >=0 && startCol < image[0].length;
        
        if(!underMatrix) return;
        if(underMatrix && image[startRow][startCol] != initialpixel) return;
        if(underMatrix && image[startRow][startCol] == color) return;
        else if(underMatrix && image[startRow][startCol] == initialpixel ){
            image[startRow][startCol] = color;
             Solution(image,startRow+1,startCol,color,initialpixel);
             Solution(image,startRow-1,startCol,color,initialpixel);
             Solution(image,startRow,startCol+1,color,initialpixel);
             Solution(image,startRow,startCol-1,color,initialpixel);
        }else{
            return;
        }
        
    }
}