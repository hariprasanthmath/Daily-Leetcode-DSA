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
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        return Solution(root, list);
    }
    public static List<Integer> Solution(Node root, List<Integer> list){
        if(root == null) return list;
        
        list.add(root.val);
        for(int index=0;index<root.children.size();index++){
            Solution(root.children.get(index), list);
        }
        return list;
    }
}