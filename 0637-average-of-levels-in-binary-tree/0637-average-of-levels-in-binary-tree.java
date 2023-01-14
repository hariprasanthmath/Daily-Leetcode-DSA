/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>> breathList = new ArrayList<>();
        List<Double> result = new ArrayList<>();
         valueAtLevel(root, breathList, 0);
        for(int index=0;index<breathList.size();index++){
           double sum = 0;
           for(int idx=0; idx<breathList.get(index).size(); idx++){
               sum = sum + breathList.get(index).get(idx);
           }
           double sumAverage = sum/breathList.get(index).size();
            result.add(sumAverage);
        }
        return result;
    }
    public static List<List<Integer>> valueAtLevel(TreeNode root, List<List<Integer>> breathList, int depth){
        if(root == null) return breathList;
        int breathListsize = breathList.size();
        if(breathListsize < depth+1){
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            breathList.add(list);
        }else{
            breathList.get(depth).add(root.val);
        }
        valueAtLevel(root.left, breathList, depth+1);
        valueAtLevel(root.right, breathList, depth+1);
        return breathList;
    }
}