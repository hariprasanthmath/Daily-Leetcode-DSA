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
    public boolean isBalanced(TreeNode root) {
        
        if(root == null) return true;
        // getting the height of the left sub tree
        int left = heightFinder(root.left, 0);
        // getting the height of the right sub tree
        int right = heightFinder(root.right, 0);
        // if difference btw lefft and right is more than 1 return false
        if(Math.abs(left-right) > 1) return false;
       // recursively check if balanced or not
       return  isBalanced(root.left) && isBalanced(root.right);
    }
    
    // finding the height of the tree
    public static int heightFinder(TreeNode root, int depth){
        if(root == null) return depth;
        return Math.max(heightFinder(root.left, depth+1),heightFinder(root.right, depth+1));
    }
}