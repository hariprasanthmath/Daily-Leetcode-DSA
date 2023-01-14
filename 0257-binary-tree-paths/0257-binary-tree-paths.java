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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        return customTreePath(root, result, ""+root.val, 0);
    }
    public static List<String> customTreePath(TreeNode root, List<String> result, String currentRoute, int depth){
        if(root == null) return result;
        if(depth != 0)  currentRoute = currentRoute + "->" + root.val;
        if(root.left == null && root.right == null) {
            result.add(currentRoute);
            return result;
        }
        customTreePath(root.left, result, currentRoute,depth+1);
        customTreePath(root.right, result, currentRoute,depth+1);
        return result;
    }
}