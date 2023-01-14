/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        return LevelOrderTraversal(root, result, 0);
    }
    public static  List<List<Integer>>  LevelOrderTraversal(Node root,  List<List<Integer>> result, int depth){
        if(root == null) return result;
        
        int resultSize = result.size();
        if(depth+1 <= resultSize){
            result.get(depth).add(root.val);
        }else{
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            result.add(list);
        }
        
        for(int index=0;index<root.children.size();index++){
            LevelOrderTraversal(root.children.get(index), result, depth+1);
        }
        
        return result;
    }
}