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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> resultFinal = new ArrayList<>();
        
        // treemap which stores values in descending order
        TreeMap<Integer, List<Integer>> depthListMap = new TreeMap<>(Collections.reverseOrder());
        customLevelOrder(root, 0, depthListMap);
        
        
        // code to iterate treemap
          Set<Map.Entry<Integer, List<Integer>> > entries = depthListMap.entrySet();
        for (Map.Entry<Integer, List<Integer>> entry : entries) {
            resultFinal.add(entry.getValue());
        }
        
        
        return resultFinal;
    }
    public static void customLevelOrder(TreeNode root,  int depth,  TreeMap<Integer, List<Integer>> depthListMap){
        if(root == null) return;
        customLevelOrder(root.left,  depth+1, depthListMap);
        customLevelOrder(root.right,  depth+1, depthListMap);
        
        if(!depthListMap.containsKey(depth)){
             List<Integer> list = new ArrayList<>();
            list.add(root.val);
            depthListMap.put(depth, list);
            
        }else{
           List<Integer> list = depthListMap.get(depth);
                list.add(root.val);
           
        }
        return;
       
        
    }
}