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
    public int minDiffInBST(TreeNode root) {
        // HashSet<Integer> treeValues = new HashSet<>();
        List<Integer> treeValues = new ArrayList<>();
        SearchTree(treeValues,root);
        
        Collections.sort(treeValues);
        // System.out.println(treeValues);
        int minimumDifference = Integer.MAX_VALUE;
        for(int index=0;index<treeValues.size()-1;index++){
            minimumDifference = Math.min(minimumDifference, treeValues.get(index+1) - treeValues.get(index));
        }
        
        return minimumDifference;
    }
    
    public static void SearchTree(List<Integer> treeValues, TreeNode root){
        
        if(root == null){
            return;
        }else{
            treeValues.add(root.val);
        }
        
        SearchTree(treeValues,root.left);
        SearchTree(treeValues,root.right);
        
        
    }
    
    
}