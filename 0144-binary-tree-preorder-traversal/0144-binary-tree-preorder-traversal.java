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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return Solution(root, list);
        
    }
     public static List<Integer> Solution(TreeNode root, List<Integer> list){
         if(root == null) return list;
         
         list.add(root.val);
         Solution(root.left, list);
         Solution(root.right, list);
         
         return list;
     }
}