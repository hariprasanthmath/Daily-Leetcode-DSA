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
    public int sumOfLeftLeaves(TreeNode root) {
       return customSolution(root,false,0);
    }
    public static int customSolution(TreeNode root, boolean LastLeft, int sum){
        if(root == null) return sum;
        if(root.left == null && root.right == null && LastLeft){
            sum += root.val;
        }
        sum = customSolution(root.left, true, sum);
        sum = customSolution(root.right, false, sum);
        return sum;
    }
}