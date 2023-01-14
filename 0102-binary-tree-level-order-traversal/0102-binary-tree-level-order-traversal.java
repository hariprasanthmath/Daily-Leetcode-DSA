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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        return LevelOrderTraversal(root, result, 0);
    }
    public static List<List<Integer>>  LevelOrderTraversal(TreeNode root, List<List<Integer>> result, int depth){
        if(root == null) return result;
        int resultSize = result.size();
        if(resultSize >= depth+1){
            result.get(depth).add(root.val);
        }else{
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            result.add(list);
        }
        
            LevelOrderTraversal(root.left, result, depth+1);
            LevelOrderTraversal(root.right, result, depth+1);
        
        
        return result;
    }
}