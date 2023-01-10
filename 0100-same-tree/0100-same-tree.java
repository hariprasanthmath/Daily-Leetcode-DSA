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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        // we are comparing both the trees parlelly
        
        // if both are null  means they reached the end and same 
        if(p == null && q == null) return true;
        
        // only one reached the end which means not same
        if(p == null || q == null) return false;
        
        // if the value at the node is not same for both
        if(p.val != q.val) return false;
        
        
        // if all the condition pass return true
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}