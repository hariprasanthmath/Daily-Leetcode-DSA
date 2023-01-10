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
    public int maxDepth(TreeNode root) {
    
        return depthFinder(root, 0);
    }
    public static int depthFinder(TreeNode root, int depth){
        
        // if the current node is null we will return the current depth
        if(root == null) return depth;
        
        // we will recursively increase the depth 
        return Math.max(depthFinder(root.left, depth+1), depthFinder(root.right, depth+1));
    }
}